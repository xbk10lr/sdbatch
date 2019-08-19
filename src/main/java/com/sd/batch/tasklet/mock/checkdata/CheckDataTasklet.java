package com.sd.batch.tasklet.mock.checkdata;

import java.util.Date;
import java.util.List;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.sd.batch.base.constants.ChannelCode;
import com.sd.batch.base.constants.CheckFlag;
import com.sd.batch.base.constants.JobParameteresKey;
import com.sd.batch.dto.generate.CheckChannelReg;
import com.sd.batch.dto.generate.CheckChannelRegExample;
import com.sd.batch.mapper.CheckChannelRegMapper;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class CheckDataTasklet implements Tasklet{
	
	@Autowired
	private CheckChannelRegMapper checkChannelRegMapper;
	
	@Override
	public RepeatStatus execute(StepContribution arg0, ChunkContext arg1) throws Exception {
		log.info("check data tasklet start");
		Date checkDate = (Date) arg1.getStepContext().getJobParameters().get(JobParameteresKey.CHECK_DATE);
		CheckChannelRegExample example = new CheckChannelRegExample();
		example.createCriteria().andChannelCodeEqualTo(ChannelCode.MOCK).andCheckDateEqualTo(checkDate).andCheckFlagEqualTo(CheckFlag.ANALYSED);
		List<CheckChannelReg> checkChannelRegs = checkChannelRegMapper.selectByExample(example);
		//判断当前对账日文对账文件是否解析成功
		if(checkChannelRegs!= null && !checkChannelRegs.isEmpty()){
			//事务对账
			checkData(checkDate);
		}else{
			log.error("check file not parse!");
			throw new Exception("check file not parse, stop execute check data step!");
		}
		log.info("check data tasklet complete");
		return RepeatStatus.FINISHED;
	}
	
	@Transactional
	private void checkData(Date checkDate){
		
	}
	
	
}
