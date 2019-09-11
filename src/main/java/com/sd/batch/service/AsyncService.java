package com.sd.batch.service;

public interface AsyncService {

	public void runJob(String jobName,String date);
	
	public void continueJob(Long jobExecutionId);
}

