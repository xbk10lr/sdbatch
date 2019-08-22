package com.sd.batch.service;

import java.util.Date;

public interface CheckMerOrderService {

	public void merOrderPreCheck(Date checkDate);
	
	public void merOrderCheck();
}
