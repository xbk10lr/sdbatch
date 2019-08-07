package com.sd.batch.tasklet.checkdata;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.stereotype.Component;

import com.sd.batch.dto.generate.DataDict;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class DownCheckFileTasklet implements Tasklet{
	
	@Override
	public RepeatStatus execute(StepContribution arg0, ChunkContext arg1) throws Exception {
		log.info("down check file tasklet start");
		/**
		 * 下载对账文件
		 */
		
		
		
		return RepeatStatus.FINISHED;
	}

	
}
