package com.sd.batch.service;

import java.util.Date;
import java.util.List;

import com.sd.batch.dto.common.PreCheckOrder;
import com.sd.batch.dto.generate.DownOrder;

public interface DaoService {
	
	public void insertDownOrderByBatch(List<DownOrder> list);
	
	public void moveChannelOrderDataToPreCheckSheet(Date checkDate);
	
	public List<PreCheckOrder> selectPreCheckOrder();
	
	public void updateDownOrderByBatch(List<PreCheckOrder> list);
	
	public void updateChannelOrderPreCheckByBatch(List<PreCheckOrder> list);

}
