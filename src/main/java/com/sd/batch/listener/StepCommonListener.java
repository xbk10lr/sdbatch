package com.sd.batch.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.stereotype.Component;

@Component
public class StepCommonListener implements StepExecutionListener {

	private static final Logger log = LoggerFactory.getLogger(StepCommonListener.class);
	
	long startTime;
	
	long endTime;
	
	@Override
	public ExitStatus afterStep(StepExecution arg0) {
		endTime = System.currentTimeMillis();
		log.info("<<<<<<<<<<<<<<<<<<<<DataJudgeStlmStepListener end");
		log.info("<<<<<<<<<<<<<<<<<<<<耗时："+((endTime - startTime) + "ms"));
		return ExitStatus.COMPLETED;
	}

	@Override
	public void beforeStep(StepExecution arg0) {
		startTime = System.currentTimeMillis();
		log.info("DataJudgeStlmStepListener begin>>>>>>>>>");		
	}

}
