package com.sd.batch.tasklet.mock.checkdata;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sd.batch.service.CheckDataService;

import lombok.extern.slf4j.Slf4j;

/**
 * 数据清理
 *
 */
@Slf4j
@Component
public class CleanDataTasklet implements Tasklet{
	
	@Autowired
	private CheckDataService checkDataService;
	
	@Override
	public RepeatStatus execute(StepContribution arg0, ChunkContext arg1) throws Exception {
		log.info("clean data tasklet start");
		checkDataService.cleanData();
		log.info("clean data tasklet complete");
		return RepeatStatus.FINISHED;
	}
	
	
}
