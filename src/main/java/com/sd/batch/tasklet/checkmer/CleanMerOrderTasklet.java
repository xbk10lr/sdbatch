package com.sd.batch.tasklet.checkmer;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sd.batch.service.CheckMerOrderService;

import lombok.extern.slf4j.Slf4j;

/**
 * 数据清理
 *
 */
@Slf4j
@Component
public class CleanMerOrderTasklet implements Tasklet{
	
	@Autowired
	private CheckMerOrderService checkMerOrderService;
	
	@Override
	public RepeatStatus execute(StepContribution arg0, ChunkContext arg1) throws Exception {
		log.info(this.getClass()+"start");
		checkMerOrderService.cleanMerOrder();
		log.info(this.getClass()+"complete");
		return RepeatStatus.FINISHED;
	}
	
	
}
