package com.sd.batch.listener;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class JobCommonListener implements JobExecutionListener {
	
	long startTime;
	
	long endTime;
	
	
	@Override
	public void afterJob(JobExecution arg0) {
		endTime = System.currentTimeMillis();
		log.info("<<<<<<<<<<<<<<<<<<<<Job end");
		log.info("<<<<<<<<<<<<<<<<<<<<耗时："+((endTime - startTime) + "ms"));
	}

	@Override
	public void beforeJob(JobExecution arg0) {
		log.info("<<<<<<<<<<<<<<<<<<<<Job start");
		startTime = System.currentTimeMillis();

	}

}
