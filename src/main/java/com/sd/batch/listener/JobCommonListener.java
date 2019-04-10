package com.sd.batch.listener;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JobCommonListener implements JobExecutionListener {
	
	long startTime;
	
	long endTime;
	
	
	@Override
	public void afterJob(JobExecution arg0) {
		endTime = System.currentTimeMillis();
		log.info("<<<<<<<<<<<<<<<<<<<<DataJudgeStlmStepListener end");
		log.info("<<<<<<<<<<<<<<<<<<<<耗时："+((endTime - startTime) + "ms"));
	}

	@Override
	public void beforeJob(JobExecution arg0) {
		// TODO Auto-generated method stub

	}

}
