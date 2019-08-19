package com.sd.batch.tasklet.mock.checkdata;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class CheckDataTasklet implements Tasklet{
	
	@Override
	public RepeatStatus execute(StepContribution arg0, ChunkContext arg1) throws Exception {
		log.info("check data tasklet start");
		log.info("check data tasklet complete");
		return RepeatStatus.FINISHED;
	}
	
	
}
