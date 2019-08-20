package com.sd.batch.service;

import java.util.Date;

/**
 * 对账服务接口
 * @author Administrator
 *
 */
public interface CheckDataService {

	public void parseCheckFileAndInsertDownOrder(String channelCode,Date checkDate) throws Exception;
	
	public void prepareCheckData(Date checkDate);
	
	public void checkDataPreCheck(String channelCode,Date checkDate) throws Exception;
	
	public void checkData(String channelCode,Date checkDate) throws Exception;
	
}
