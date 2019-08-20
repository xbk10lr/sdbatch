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

@Slf4j
@Component
public class CheckDataTasklet implements Tasklet{
	
	@Autowired
	private CheckDataService checkDataService;
	
	@Override
	public RepeatStatus execute(StepContribution arg0, ChunkContext arg1) throws Exception {
		log.info("check data tasklet start");
		Date checkDate = (Date) arg1.getStepContext().getJobParameters().get(JobParameteresKey.CHECK_DATE);
		//对账前置检查--判断当前对账日文对账文件是否解析成功
		checkDataService.checkDataPreCheck(ChannelCode.MOCK, checkDate);
		//开始对账，以下游对账文件为准
		checkDataService.checkData(ChannelCode.MOCK, checkDate);
		log.info("check data tasklet complete");
		return RepeatStatus.FINISHED;
	}
	
}
