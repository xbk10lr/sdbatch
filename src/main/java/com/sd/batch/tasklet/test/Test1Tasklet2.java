package com.sd.batch.tasklet.test;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.stereotype.Component;

import com.sd.batch.base.constants.JobParameteresKey;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class Test1Tasklet2 implements Tasklet{

	@Override
	public RepeatStatus execute(StepContribution arg0, ChunkContext arg1) throws Exception {
		log.info("test1taskled2启动，并成功执行");
		System.out.println(arg1.getStepContext().getJobParameters().get(JobParameteresKey.CHECK_DATE));
//		arg0.setExitStatus(ExitStatus.FAILED);
		if(true){
			throw new Exception("test1taskled2 fail");
		}
		return RepeatStatus.FINISHED;
	}

	
}
