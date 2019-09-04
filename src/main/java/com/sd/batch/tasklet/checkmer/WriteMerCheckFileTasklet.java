package com.sd.batch.tasklet.checkmer;

import java.util.Date;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sd.batch.base.constants.JobParameteresKey;
import com.sd.batch.service.CheckMerOrderService;

import lombok.extern.slf4j.Slf4j;

/**
 * 生成商户文件
 *
 */
@Slf4j
@Component
public class WriteMerCheckFileTasklet implements Tasklet{
	
	@Autowired
	private CheckMerOrderService checkMerOrderService;
	
	@Override
	public RepeatStatus execute(StepContribution arg0, ChunkContext arg1) throws Exception {
		log.info(this.getClass()+"start");
		Date checkDate = (Date) arg1.getStepContext().getJobParameters().get(JobParameteresKey.CHECK_DATE);
		checkMerOrderService.writeCheckFile(checkDate);
		log.info(this.getClass()+"complete");
		return RepeatStatus.FINISHED;
	}
	
	
}
