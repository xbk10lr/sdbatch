package com.sd.batch.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sd.batch.base.constants.CheckStatus;
import com.sd.batch.base.constants.FileId;
import com.sd.batch.base.constants.OrderStatus;
import com.sd.batch.base.utils.IdSeqFactory;
import com.sd.batch.base.utils.file.WriteFileUtil;
import com.sd.batch.dto.common.ClearMerOrder;
import com.sd.batch.dto.generate.ChannelMerCheckExample;
import com.sd.batch.dto.generate.MerOrderExample;
import com.sd.batch.dto.generate.MerOrderPreCheck;
import com.sd.batch.dto.generate.MerOrderPreCheckExample;
import com.sd.batch.dto.generate.MerOrderSum;
import com.sd.batch.dto.generate.MerOrderSumExample;
import com.sd.batch.mapper.ChannelMerCheckMapper;
import com.sd.batch.mapper.MerOrderMapper;
import com.sd.batch.mapper.MerOrderPreCheckMapper;
import com.sd.batch.mapper.MerOrderSumMapper;
import com.sd.batch.mapper.extend.MerOrderHistExtendMapper;
import com.sd.batch.mapper.extend.MerOrderPreCheckExtendMapper;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CheckMerOrderServiceImpl implements CheckMerOrderService {

	@Autowired
	private MerOrderHistExtendMapper merOrderHistExtendMapper;
	
	@Autowired
	private MerOrderMapper merOrderMapper;
	
	@Autowired
	private MerOrderPreCheckMapper merOrderPreCheckMapper;
	
	@Autowired
	private MerOrderPreCheckExtendMapper merOrderPreCheckExtendMapper;
	
	@Autowired
	private ChannelMerCheckMapper channelMerCheckMapper;
	
	@Autowired
	private MerOrderSumMapper merOrderSumMapper;
	
	@Override
	@Transactional
	public void merOrderPreCheck(Date checkDate) {
		log.info("merOrderPreCheck start checkDate :"+checkDate);
		//把当前对账日期商户订单表中的数据转移到历史表中
		merOrderPreCheckExtendMapper.insertMerOrderPreCheckFromMerOrder(checkDate);
		//删除当前表中对账日期以及对账日期之前的订单记录
		MerOrderExample merOrderExample = new MerOrderExample();
		merOrderExample.createCriteria().andTransDateLessThanOrEqualTo(checkDate);
		merOrderMapper.deleteByExample(merOrderExample);
		//把商户订单待对账表中当前对账日期以及之前的对账状态为初始订单的对账状态更新为待对账
		MerOrderPreCheckExample merOrderPreCheckExample = new MerOrderPreCheckExample();
		merOrderPreCheckExample.createCriteria().andTransDateLessThanOrEqualTo(checkDate).andCheckStatusEqualTo(CheckStatus.INIT);
		MerOrderPreCheck merOrderPreCheck = new MerOrderPreCheck();
		merOrderPreCheck.setCheckStatus(CheckStatus.PRECHECK);
		merOrderPreCheckMapper.updateByExampleSelective(merOrderPreCheck, merOrderPreCheckExample);
		log.info("merOrderPreCheck end");
	}
	
	//商户对账
	@Transactional
	@Override
	public void merOrderCheck() {
		//先更新商户订单中交易成功的
		merOrderPreCheckExtendMapper.updatePreCheckMerOrderSuccess();
		MerOrderPreCheckExample example = new MerOrderPreCheckExample();
		//其余的更新为交易失败
		example.createCriteria().andCheckStatusEqualTo(CheckStatus.PRECHECK);
		MerOrderPreCheck record = new MerOrderPreCheck();
		record.setCheckStatus(CheckStatus.CHECKED);
		record.setOrderStatus(OrderStatus.FAIL);
		merOrderPreCheckMapper.updateByExampleSelective(record, example);
	}

	@Override
	public void clearMerOrder(Date checkDate) {
		List<ClearMerOrder> clearMerOrders = merOrderPreCheckExtendMapper.getMerOrderSum(checkDate);
		for(ClearMerOrder clearMerOrder:clearMerOrders){
			MerOrderSum merOrderSum = new MerOrderSum();
			merOrderSum.setClearDate(checkDate);
			merOrderSum.setClearTime(new Date());
			merOrderSum.setMerNo(clearMerOrder.getMerNo());
			merOrderSum.setSettleNbr(IdSeqFactory.getIdSeqByTimestamp(clearMerOrder.getMerNo()));
			merOrderSum.setTotalAmt(clearMerOrder.getTotalAmt());
			merOrderSum.setTotalCount(clearMerOrder.getTotalCount());
			merOrderSum.setTotalFailAmt(clearMerOrder.getFailAmt());
			merOrderSum.setTotalFailCount(clearMerOrder.getFailCount());
			merOrderSum.setTotalSuccessAmt(clearMerOrder.getSuccessAmt());
			merOrderSum.setTotalSuccessCount(clearMerOrder.getSuccessCount());
			merOrderSum.setTotalUncheckAmt(clearMerOrder.getUncheckAmt());
			merOrderSum.setTotalUncheckCount(clearMerOrder.getUncheckCount());
			merOrderSumMapper.insertSelective(merOrderSum);
		}
	}

	@Override
	public void writeCheckFile(Date checkDate) throws Exception {
		MerOrderSumExample example = new MerOrderSumExample();
		example.createCriteria().andClearDateEqualTo(checkDate);
		List<MerOrderSum> merOrderSums = merOrderSumMapper.selectByExample(example);
		for(MerOrderSum merOrderSum:merOrderSums){
			String merNo = merOrderSum.getMerNo();
			MerOrderPreCheckExample example2 = new MerOrderPreCheckExample();
			example2.createCriteria().andCheckDateEqualTo(checkDate).andCheckStatusEqualTo(CheckStatus.CHECKED).andOrderStatusEqualTo(OrderStatus.SUCCESS).andMerNoEqualTo(merNo);
			List<MerOrderPreCheck> merOrderPreChecks = merOrderPreCheckMapper.selectByExample(example2);
			Map<String,Object> fileHead = new HashMap<String,Object>();
			fileHead.put("shh", merNo);
			fileHead.put("zje", merOrderSum.getTotalAmt());
			fileHead.put("zbs", merOrderSum.getTotalCount());
			fileHead.put("cgzje", merOrderSum.getTotalSuccessAmt());
			fileHead.put("cgzbs", merOrderSum.getTotalSuccessCount());
			List<Map<String,Object>> dataMaps = new ArrayList<>();
			for(MerOrderPreCheck merOrderPreCheck:merOrderPreChecks){
				Map<String,Object> dataMap = new HashMap<String,Object>();
				dataMap.put("shh", merNo);
				dataMap.put("sdptlsh", merOrderPreCheck.getPlatSeqNbr());
				dataMap.put("shddh", merOrderPreCheck.getMerSeqNbr());
				dataMap.put("jyje", merOrderPreCheck.getTransAmt());
				dataMap.put("sdptjyrq", merOrderPreCheck.getTransDate());
				dataMaps.add(dataMap);
			}
			WriteFileUtil writeFileUtil = new WriteFileUtil();
			writeFileUtil.writeFile(FileId.WRITE_CHECK_FILE_HEAD, FileId.WRITE_CHECK_FILE_BODY, "", "sdCheckFile", dataMaps, fileHead);
		}
	}

	@Override
	public void cleanMerOrder() {
		//对账后续处理，待对账表中对账平的数据移到历史表中
		merOrderHistExtendMapper.insertMerOrderHistFromMerOrder();
		//删除待对账表、渠道商户对账表中对账平的数据
		MerOrderPreCheckExample example2 = new MerOrderPreCheckExample();
		example2.createCriteria().andCheckStatusEqualTo(CheckStatus.CHECKED);
		merOrderPreCheckMapper.deleteByExample(example2);
		ChannelMerCheckExample example3 = new ChannelMerCheckExample();
		example3.createCriteria().andCheckStatusEqualTo(CheckStatus.CHECKED);
		channelMerCheckMapper.deleteByExample(example3);
	}

}
