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
import com.sd.batch.mapper.extend.ChannelOrderPreCheckExtendMapper;
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
	
	@Autowired
	private ChannelOrderPreCheckExtendMapper channelOrderPreCheckExtendMapper;
	
	@Override
	public void insertDownOrderByBatch(List<DownOrder> list) {
		log.info("batch insert down order start");
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
		List<PreCheckOrder> preCheckOrder = downOrderExtendMapper.selectPreCheckOrder(ChannelCode.MOCK, CheckStatus.PRECHECK);
		log.info("select pre check order end, take time:"+(System.currentTimeMillis()-start)+"ms");
		return preCheckOrder;
	}
	
	@Override
	public void updateDownOrderByBatch(List<PreCheckOrder> list){
		log.info("batch update down order start");
		if(list == null || list.isEmpty()){
			log.info("there is none data to be update sheet downOrder");
			return;
		}
		long start = System.currentTimeMillis();
		//剩余待更新数据库的长度
		int lengthRemaining = list.size();
		//每批次更新量
		int batchCount = 1000;
		int index = 0;
		log.info("batch update start, init length="+lengthRemaining+", each batch update length="+batchCount);
		while(true){
			if(batchCount >= lengthRemaining){
				List<PreCheckOrder> toUpdate = list.subList(index, index+lengthRemaining);
				downOrderExtendMapper.updateDownOrderByBatch(toUpdate);
				break;
			} else {
				List<PreCheckOrder> toUpdate = list.subList(index, index+batchCount);
				downOrderExtendMapper.updateDownOrderByBatch(toUpdate);
				index=index+batchCount;
				lengthRemaining=lengthRemaining-batchCount;
			}
		}
		log.info("batch update down order take time :"+(System.currentTimeMillis()-start)+"ms");
	}

	@Override
	public void updateChannelOrderPreCheckByBatch(List<PreCheckOrder> list) {
		log.info("batch update channelOrderPreCheck start");
		if(list == null || list.isEmpty()){
			log.info("there is none data to be update sheet channelOrderPreCheck");
			return;
		}
		long start = System.currentTimeMillis();
		//剩余待更新数据库的长度
		int lengthRemaining = list.size();
		//每批次更新量
		int batchCount = 1000;
		int index = 0;
		log.info("batch update start, init length="+lengthRemaining+", each batch update length="+batchCount);
		while(true){
			if(batchCount >= lengthRemaining){
				List<PreCheckOrder> toUpdate = list.subList(index, index+lengthRemaining);
				channelOrderPreCheckExtendMapper.updateChannelOrderPreCheckByBatch(toUpdate);
				break;
			} else {
				List<PreCheckOrder> toUpdate = list.subList(index, index+batchCount);
				channelOrderPreCheckExtendMapper.updateChannelOrderPreCheckByBatch(toUpdate);
				index=index+batchCount;
				lengthRemaining=lengthRemaining-batchCount;
			}
		}
		log.info("batch update channelOrderPreCheck take time :"+(System.currentTimeMillis()-start)+"ms");
		
	}

}
