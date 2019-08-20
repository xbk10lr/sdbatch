package com.sd.batch.service;

import java.util.Date;

import com.sd.batch.dto.common.RespCheckFileApply;

public interface CheckFileService {
	
	public void deleteDuplicatedCheckChannelReg(String channelCode,Date checkDate);
	
	public void insertCheckChannelReg(String channelCode,Date checkDate);
	
	public RespCheckFileApply queryCheckFile(Date checkDate);
	
	public void updateCheckChannelRegApplied(RespCheckFileApply resp, Date checkDate) throws Exception;
	
	public void downCheckFile(String channelCode,Date checkDate) throws Exception;
}
