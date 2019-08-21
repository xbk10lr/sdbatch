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
import com.sd.batch.service.CheckFileService;

import lombok.extern.slf4j.Slf4j;

/**
 * 初始化对账文件登记表
 *
 */
@Slf4j
@Component
public class InitCheckFileTasklet implements Tasklet{
	
	@Autowired
	private CheckFileService checkFileService;
	
	@Override
	public RepeatStatus execute(StepContribution arg0, ChunkContext arg1) throws Exception {
		log.info("Init Check File Tasklet Start");
		Date checkDate = (Date) arg1.getStepContext().getJobParameters().get(JobParameteresKey.CHECK_DATE);
		//先执行删除语句，确保当日记录唯一
		checkFileService.deleteDuplicatedCheckChannelReg(ChannelCode.MOCK, checkDate);
		//插入一条记录
		checkFileService.insertCheckChannelReg(ChannelCode.MOCK, checkDate);
		return RepeatStatus.FINISHED;
		
	}
	
	
}
