package com.sd.batch.service;

import java.util.Date;

public interface CheckMerOrderService {

	public void merOrderPreCheck(Date checkDate);
	
	public void merOrderCheck();
	
	public void clearMerOrder(Date checkDate);
	
	public void writeCheckFile(Date checkDate) throws Exception;
	
	public void cleanMerOrder();
}
