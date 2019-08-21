package com.sd.batch.tasklet.checkdata.mock;

import java.util.Date;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sd.batch.base.constants.JobParameteresKey;
import com.sd.batch.dto.common.RespCheckFileApply;
import com.sd.batch.service.CheckFileService;

import lombok.extern.slf4j.Slf4j;

/**
 * 申请对账文件
 *
 */
@Slf4j
@Component
public class ApplyCheckFileTasklet implements Tasklet{
	
	@Autowired
	private CheckFileService checkFileService;
	
	@Override
	public RepeatStatus execute(StepContribution arg0, ChunkContext arg1) throws Exception {
		log.info("down check file tasklet start");
		Date checkDate = (Date) arg1.getStepContext().getJobParameters().get(JobParameteresKey.CHECK_DATE);
		//查询对账文件
		RespCheckFileApply resp = checkFileService.queryCheckFile(checkDate);
		//根据查询结果更新文件申请状态
		checkFileService.updateCheckChannelRegApplied(resp, checkDate);
		log.info("down check file tasklet complete");
		return RepeatStatus.FINISHED;
		
		
	}
	
	
}
