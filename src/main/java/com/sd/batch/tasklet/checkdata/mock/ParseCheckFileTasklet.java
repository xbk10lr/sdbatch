package com.sd.batch.tasklet.checkdata.mock;

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
 * 解析对账文件
 *
 */
@Slf4j
@Component
public class ParseCheckFileTasklet implements Tasklet{
	
	@Autowired
	private CheckDataService checkDataService;
	
	
	@Override
	public RepeatStatus execute(StepContribution arg0, ChunkContext arg1) throws Exception {
		log.info("parse check file tasklet start");
		Date checkDate = (Date) arg1.getStepContext().getJobParameters().get(JobParameteresKey.CHECK_DATE);
		//解析文件并落库
		checkDataService.parseCheckFileAndInsertDownOrder(ChannelCode.MOCK, checkDate);
		log.info("parse check file tasklet complete");
		return RepeatStatus.FINISHED;
	}
	
	
}
