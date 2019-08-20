package com.sd.batch.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sd.batch.base.constants.ChannelCode;
import com.sd.batch.base.constants.CheckStatus;
import com.sd.batch.dto.common.PreCheckOrder;
import com.sd.batch.dto.generate.DownOrder;
import com.sd.batch.mapper.extend.ChannelOrderExtendMapper;
import com.sd.batch.mapper.extend.DownOrderExtendMapper;

import lombok.extern.slf4j.Slf4j;

/**
 * 提供数据库增删改查的扩展服务
 * @author Administrator
 *
 */
@Slf4j
@Service
public class DaoServiceImpl implements DaoService {

	@Autowired
	private ChannelOrderExtendMapper channelOrderExtendMapper;
	
	@Autowired
	private DownOrderExtendMapper downOrderExtendMapper;
	
	@Override
	public void insertDownOrderByBatch(List<DownOrder> list) {
		if(list == null || list.isEmpty()){
			log.info("there is none data to be inserted into sheet downOrder");
			return;
		}
		long start = System.currentTimeMillis();
		//剩余待插入数据库的长度
		int lengthRemaining = list.size();
		//每批次插入量
		int batchCount = 1000;
		int index = 0;
		log.info("batch insert start, init length="+lengthRemaining+", each batch insert length="+batchCount);
		while(true){
			if(batchCount >= lengthRemaining){
				List<DownOrder> toInsert = list.subList(index, index+lengthRemaining);
				downOrderExtendMapper.insertByBatch(toInsert);
				break;
			} else {
				List<DownOrder> toInsert = list.subList(index, index+batchCount);
				downOrderExtendMapper.insertByBatch(toInsert);
				index=index+batchCount;
				lengthRemaining=lengthRemaining-batchCount;
			}
			
		}
		log.info("batch insert into downOrder take time:"+(System.currentTimeMillis()-start)+"ms");
	}

	@Override
	public void moveChannelOrderDataToPreCheckSheet(Date checkDate) {
		log.info("Prepare to move data to pre check sheet, checkDate:"+checkDate);
		long start = System.currentTimeMillis();
		channelOrderExtendMapper.moveDataToPreCheckSheet(CheckStatus.PRECHECK,checkDate);
		log.info("moveDataToPreCheck take time"+(System.currentTimeMillis()-start)+"ms");
	}
	
	@Override
	public List<PreCheckOrder> selectPreCheckOrder(){
		log.info("select pre check order start");
		long start = System.currentTimeMillis();
		List<PreCheckOrder> preCheckOrder = channelOrderExtendMapper.selectPreCheckOrder(ChannelCode.MOCK, CheckStatus.PRECHECK);
		log.info("select pre check order end, take time:"+(System.currentTimeMillis()-start)+"ms");
		return preCheckOrder;
	}

}
