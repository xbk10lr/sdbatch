package com.sd.batch.listener;

import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class StepCommonListener implements StepExecutionListener {

	long startTime;
	
	long endTime;
	
	@Override
	public ExitStatus afterStep(StepExecution arg0) {
		endTime = System.currentTimeMillis();
		log.info("<<<<<<<<<<<<<<<<<<<<Step  end");
		log.info("<<<<<<<<<<<<<<<<<<<<耗时："+((endTime - startTime) + "ms"));
		return ExitStatus.COMPLETED;
	}

	@Override
	public void beforeStep(StepExecution arg0) {
		startTime = System.currentTimeMillis();
		log.info("Step begin>>>>>>>>>");		
	}

}
