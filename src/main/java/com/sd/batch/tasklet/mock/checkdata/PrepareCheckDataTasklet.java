package com.sd.batch.tasklet.mock.checkdata;

import java.util.Date;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sd.batch.base.constants.JobParameteresKey;
import com.sd.batch.service.CheckDataService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class PrepareCheckDataTasklet implements Tasklet{
	
	@Autowired
	private CheckDataService checkDataService;
	
	@Override
	public RepeatStatus execute(StepContribution arg0, ChunkContext arg1) throws Exception {
		log.info("prepare check data tasklet start");
		Date checkDate = (Date) arg1.getStepContext().getJobParameters().get(JobParameteresKey.CHECK_DATE);
		long start = System.currentTimeMillis();
		//数据准备，事务进行
		checkDataService.prepareCheckData(checkDate);
		log.info("prepare check data tasklet complete, take time"+(System.currentTimeMillis()-start)+"ms");
		return RepeatStatus.FINISHED;
	}
	
	
	
}
