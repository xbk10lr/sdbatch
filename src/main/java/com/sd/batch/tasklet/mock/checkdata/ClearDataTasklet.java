package com.sd.batch.tasklet.mock.checkdata;

import java.util.Date;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sd.batch.base.constants.ChannelCode;
import com.sd.batch.base.constants.JobParameteresKey;
import com.sd.batch.service.CheckDataService;

import lombok.extern.slf4j.Slf4j;

/**
 * 数据清分汇总
 *
 */
@Slf4j
@Component
public class ClearDataTasklet implements Tasklet{
	
	@Autowired
	private CheckDataService checkDataService;
	
	@Override
	public RepeatStatus execute(StepContribution arg0, ChunkContext arg1) throws Exception {
		log.info("clear data tasklet start");
		Date checkDate = (Date) arg1.getStepContext().getJobParameters().get(JobParameteresKey.CHECK_DATE);
		checkDataService.clearData(ChannelCode.MOCK, checkDate);
		log.info("clear data tasklet complete");
		return RepeatStatus.FINISHED;
	}
	
	
}
