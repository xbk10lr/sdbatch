package com.sd.batch.base.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sd.batch.mapper.DataDictMapper;

@Component
public class DataDictUtils {

	@Autowired
	private DataDictMapper dataDictMapper;
	
	public String getDataDictVal(String key){
		return dataDictMapper.selectByPrimaryKey(key).getDataValue();
	}
}
