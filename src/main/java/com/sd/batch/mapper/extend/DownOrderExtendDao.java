package com.sd.batch.mapper.extend;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sd.batch.dto.generate.DownOrder;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class DownOrderExtendDao {
	
	@Autowired
	private DownOrderExtendMapper downOrderExtendMapper;

	public void insertByBatch(List<DownOrder> list){
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
}
