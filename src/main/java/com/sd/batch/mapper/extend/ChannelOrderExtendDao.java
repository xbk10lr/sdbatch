package com.sd.batch.mapper.extend;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.sd.batch.base.constants.CheckStatus;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class ChannelOrderExtendDao {
	
	private ChannelOrderExtendMapper channelOrderExtendMapper;
	
	public void moveDataToPreCheckSheet(Date checkDate){
		log.info("Prepare to move data to pre check sheet, checkDate:"+checkDate);
		long start = System.currentTimeMillis();
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("checkStatus", CheckStatus.PRECHECK);
		map.put("transDate", checkDate);
		channelOrderExtendMapper.moveDataToPreCheckSheet(map);
		log.info("moveDataToPreCheck take time"+(System.currentTimeMillis()-start)+"ms");
	};
	
}
