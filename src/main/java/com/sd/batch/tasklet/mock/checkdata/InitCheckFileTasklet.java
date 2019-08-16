package com.sd.batch.tasklet.mock.checkdata;

import java.util.Date;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sd.batch.base.constants.ChannelCode;
import com.sd.batch.base.constants.CheckFlag;
import com.sd.batch.base.constants.JobParameteresKey;
import com.sd.batch.base.utils.DateUtil;
import com.sd.batch.dto.generate.CheckChannelReg;
import com.sd.batch.mapper.CheckChannelRegMapper;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class InitCheckFileTasklet implements Tasklet{
	
	@Autowired
	private CheckChannelRegMapper checkChannelRegMapper;
	
	@Override
	public RepeatStatus execute(StepContribution arg0, ChunkContext arg1) throws Exception {
		log.info("Init Check File Tasklet Start");
		Date checkDate = (Date) arg1.getStepContext().getJobParameters().get(JobParameteresKey.CHECK_DATE);
		//先执行删除语句，确保当日记录唯一
		checkChannelRegMapper.deleteByPrimaryKey(ChannelCode.MOCK, checkDate);
		//插入一条记录
		CheckChannelReg checkChannelReg = new CheckChannelReg();
		checkChannelReg.setChannelCode(ChannelCode.MOCK);
		checkChannelReg.setCheckDate(checkDate);
		checkChannelReg.setCheckFlag(CheckFlag.INIT);
		checkChannelReg.setCheckNbr(DateUtil.parseDateToStr(new Date(), DateUtil.DATE_FORMAT_YYYYMMDDHHmm));
		checkChannelRegMapper.insertSelective(checkChannelReg);
		return RepeatStatus.FINISHED;
		
	}
	
	
}
