package com.sd.batch.base.cache;

import java.util.List;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.sd.batch.dto.generate.DataDict;
import com.sd.batch.dto.generate.DataDictExample;
import com.sd.batch.mapper.DataDictMapper;

@Configuration
public class DataDictCacheManager implements InitializingBean{

	@Autowired
	private static DataDictMapper dataDictMapper;

	@Override
	public void afterPropertiesSet() throws Exception {
		initScmCache();
	}
	
	private void initScmCache() {
		DataDictExample example = new DataDictExample();
		List<DataDict> dataDicts = dataDictMapper.selectByExample(example);
		DataDictCache.setVal(dataDicts);
	}
	
	public void updateScmCache(){
		initScmCache();
	}
}
