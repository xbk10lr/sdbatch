package com.sd.batch.service;

import java.io.File;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sd.batch.base.constants.CheckFlag;
import com.sd.batch.base.constants.CheckStatus;
import com.sd.batch.base.constants.DataDictConst;
import com.sd.batch.base.constants.ErrorStatus;
import com.sd.batch.base.constants.ErrorTypEnum;
import com.sd.batch.base.constants.FileId;
import com.sd.batch.base.constants.SysNbr;
import com.sd.batch.base.constants.OrderStatus;
import com.sd.batch.base.utils.DataDictUtils;
import com.sd.batch.base.utils.IdSeqFactory;
import com.sd.batch.base.utils.file.MockFileUtil;
import com.sd.batch.dto.common.PreCheckOrder;
import com.sd.batch.dto.generate.ChannelOrder;
import com.sd.batch.dto.generate.ChannelOrderExample;
import com.sd.batch.dto.generate.CheckChannelReg;
import com.sd.batch.dto.generate.CheckChannelRegExample;
import com.sd.batch.dto.generate.CheckError;
import com.sd.batch.dto.generate.DownOrder;
import com.sd.batch.mapper.ChannelOrderMapper;
import com.sd.batch.mapper.CheckChannelRegMapper;
import com.sd.batch.mapper.CheckErrorMapper;
import com.sd.batch.mapper.SysInfoMapper;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CheckDataServiceImpl implements CheckDataService{

	@Autowired
	private CheckChannelRegMapper checkChannelRegMapper;
	
	@Autowired
	private DataDictUtils dataDictUtils;
	
	@Autowired
	private DaoService daoService;
	
	@Autowired
	private ChannelOrderMapper channelOrderMapper;
	
	@Autowired
	private CheckErrorMapper checkErrorMapper;
	
	@Autowired
	private SysInfoMapper sysInfoMapper;

	/**
	 * 解析文件并且落下游订单表
	 */
	@Override
	public void parseCheckFileAndInsertDownOrder(String channelCode, Date checkDate) throws Exception {
		CheckChannelRegExample example = new CheckChannelRegExample();
		example.createCriteria().andChannelCodeEqualTo(channelCode).andCheckDateLessThanOrEqualTo(checkDate).andCheckFlagEqualTo(CheckFlag.DOWNLOADED);
		List<CheckChannelReg> toParse = checkChannelRegMapper.selectByExample(example);
		String localFilePath = dataDictUtils.getDataDictVal(DataDictConst.LOCAL_FILE_PATH);
		MockFileUtil mockFileUtil = new MockFileUtil();
		long start = System.currentTimeMillis();
		log.info("check date:"+checkDate+",channelCode:"+channelCode+", wait paser file number:"+toParse.size());
		for(CheckChannelReg checkChannelReg : toParse){
			String fileName = checkChannelReg.getFileName();
			List<DownOrder> fileParsing = mockFileUtil.fileParsing(new File(localFilePath+fileName), FileId.MOCK_FILE_ID);
			//批量插入
			daoService.insertDownOrderByBatch(fileParsing);
			//更新文件状态为已解析
			checkChannelReg.setCheckFlag(CheckFlag.ANALYSED);
			checkChannelRegMapper.updateByPrimaryKeySelective(checkChannelReg);
		}
		log.info("check file parse and insert take time:"+(System.currentTimeMillis()-start)+"ms");
	}

	/**
	 * 对账前数据准备
	 */
	@Override
	@Transactional
	public void prepareCheckData(Date checkDate) {
		//更新渠道订单表中对账日以及对账日之前的数据为待对账
		updateChannelOrderPreCheck(checkDate);
		//把待对账的数据移到渠道订单待对账表中
		daoService.moveChannelOrderDataToPreCheckSheet(checkDate);
		//删除渠道订单表中的待对账数据
		deleteChannelOrderPreCheck(checkDate);
	}
	
	private void updateChannelOrderPreCheck(Date checkDate){
		ChannelOrderExample example = new ChannelOrderExample();
		example.createCriteria().andTransDateLessThanOrEqualTo(checkDate);
		ChannelOrder channelOrder = new ChannelOrder();
		channelOrder.setCheckStatus(CheckStatus.PRECHECK);
		long start = System.currentTimeMillis();
		channelOrderMapper.updateByExampleSelective(channelOrder, example);
		log.info("update channel order pre check take time"+(System.currentTimeMillis()-start)+"ms");
	}
	
	private void deleteChannelOrderPreCheck(Date checkDate){
		ChannelOrderExample example = new ChannelOrderExample();
		example.createCriteria().andTransDateLessThanOrEqualTo(checkDate).andCheckStatusEqualTo(CheckStatus.PRECHECK);
		long start = System.currentTimeMillis();
		channelOrderMapper.deleteByExample(example);
		log.info("delete channel order pre check take time"+(System.currentTimeMillis()-start)+"ms");
	}

	/**
	 * 对账前检查
	 */
	@Override
	public void checkDataPreCheck(String channelCode, Date checkDate) throws Exception {
		CheckChannelRegExample example = new CheckChannelRegExample();
		example.createCriteria().andChannelCodeEqualTo(channelCode).andCheckDateEqualTo(checkDate).andCheckFlagEqualTo(CheckFlag.ANALYSED);
		List<CheckChannelReg> checkChannelRegs = checkChannelRegMapper.selectByExample(example);
		if(checkChannelRegs == null || checkChannelRegs.isEmpty()){
			log.error("check file not parse!");
			throw new Exception("check file not parse, stop execute check data step!");
		}
		
	}

	/**
	 * 对账
	 */
	@Override
	@Transactional
	public void checkData(String channelCode, Date checkDate) throws Exception {
		List<PreCheckOrder> preCheckOrders = daoService.selectPreCheckOrder();
		Date lastTransTime = null;
		//获得待对账表中最晚一笔成功的交易时间
		for(PreCheckOrder preCheckOrder : preCheckOrders){
			if(Boolean.valueOf(preCheckOrder.getDownExist())){
				lastTransTime = preCheckOrder.getTransTime();
			}
		}
		log.info("channel "+channelCode+" have success order at "+checkDate+", deadline is "+lastTransTime);
		//循环对账
		for(int i = preCheckOrders.size()-1;i>=0;i--){
			PreCheckOrder preCheckOrder = preCheckOrders.get(i);
			//下游提供对账单中存在该笔交易，表示该笔交易成功
			if(Boolean.valueOf(preCheckOrder.getDownExist())){
				//若下游对账文件中的金额和本地保存的不一致，出差错
				if(preCheckOrder.getDownTransAmt().compareTo(preCheckOrder.getTransAmt()) != 0){
					preCheckOrder.setCheckStatus(CheckStatus.UNCHECKED);
					insertCheckError(preCheckOrder,ErrorTypEnum.AMT_NOT_EQUAL);
				} else {
					preCheckOrder.setCheckStatus(CheckStatus.CHECKED);
					preCheckOrder.setDownOrderStatus(OrderStatus.SUCCESS);
				}
			} else {
				//下游提供对账单中不存在该笔交易
				//若此时订单表中交易状态为成功，出差错
				if(OrderStatus.SUCCESS.equals(preCheckOrder.getOrderStatus())){
					preCheckOrder.setCheckStatus(CheckStatus.UNCHECKED);
					insertCheckError(preCheckOrder,ErrorTypEnum.UP_SUCCESS_DOWN_FAIL);
				} else {
					//若该笔订单时间在最后一笔订单交易时间之前
					if(preCheckOrder.getTransTime().before(lastTransTime)){
						preCheckOrder.setCheckStatus(CheckStatus.CHECKED);
						preCheckOrder.setDownOrderStatus(OrderStatus.FAIL);
					} else {
						preCheckOrders.remove(i);
					}
				}
			}
		}
		
	}
	
	private void insertCheckError(PreCheckOrder preCheckOrder,ErrorTypEnum errorTypEnum){
		CheckError checkError = new CheckError();
		checkError.setClearDate(sysInfoMapper.selectByPrimaryKey(SysNbr.BATCH_NAME).getNowDate());
		checkError.setErrorTyp(errorTypEnum.getErrorTyp());
		checkError.setErrorDesc(errorTypEnum.getErrorDesc());
		checkError.setErrorNbr(IdSeqFactory.getIdSeqByTimestamp(preCheckOrder.getOrderSeqNbr()));
		checkError.setErrorStatus(ErrorStatus.WAIT_HANDLE);
		checkError.setPlatSeqNbr(preCheckOrder.getPlatSeqNbr());
		checkErrorMapper.insertSelective(checkError);
	}
}