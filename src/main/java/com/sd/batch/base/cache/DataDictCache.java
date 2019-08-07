package com.sd.batch.base.cache;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.sd.batch.base.utils.StringUtil;
import com.sd.batch.dto.generate.DataDict;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DataDictCache {
	
	private static Map<String, String> DATA_DICT = new ConcurrentHashMap<String, String>();
	
	public static String getVal(String key){
		log.info("start get val key: "+key);
		String val = DATA_DICT.get(key);
		log.info("key="+key+"，val="+val);
		return val;
	}
	
    static void setVal(List<DataDict> dataDicts){
		log.info("start put dataDict");
		for(DataDict dataDict: dataDicts){
			String val = DATA_DICT.get(dataDict.getDataKey());
			if(StringUtil.isObjectEmpty(val) || !val.equals(dataDict.getDataValue())){
				DATA_DICT.put(dataDict.getDataKey(), dataDict.getDataValue());
			};
		}
		log.info("dataDict: "+StringUtil.mapToString(DATA_DICT));
	}
	
}
