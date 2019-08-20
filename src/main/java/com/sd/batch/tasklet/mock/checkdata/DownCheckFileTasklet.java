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
import com.sd.batch.service.CheckFileService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class DownCheckFileTasklet implements Tasklet {

	@Autowired
	private CheckFileService checkFileService;
	
	@Override
	public RepeatStatus execute(StepContribution arg0, ChunkContext arg1) throws Exception {
		log.info("down check file tasklet start");
		Date checkDate = (Date) arg1.getStepContext().getJobParameters().get(JobParameteresKey.CHECK_DATE);
		//下载对账文件
		checkFileService.downCheckFile(ChannelCode.MOCK, checkDate);
		return RepeatStatus.FINISHED;

	}

}
