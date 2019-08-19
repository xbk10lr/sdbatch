package com.sd.batch.tasklet.mock.checkdata;

import java.util.Date;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.sd.batch.base.constants.CheckStatus;
import com.sd.batch.base.constants.JobParameteresKey;
import com.sd.batch.dto.generate.ChannelOrder;
import com.sd.batch.dto.generate.ChannelOrderExample;
import com.sd.batch.mapper.ChannelOrderMapper;
import com.sd.batch.mapper.extend.ChannelOrderExtendDao;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class PrepareCheckDataTasklet implements Tasklet{
	
	@Autowired
	private ChannelOrderExtendDao channelOrderExtendDao;
	
	@Autowired
	private ChannelOrderMapper channelOrderMapper;
	
	@Override
	public RepeatStatus execute(StepContribution arg0, ChunkContext arg1) throws Exception {
		log.info("prepare check data tasklet start");
		Date checkDate = (Date) arg1.getStepContext().getJobParameters().get(JobParameteresKey.CHECK_DATE);
		//数据准备，事务进行
		preCheckData(checkDate);
		log.info("prepare check data tasklet complete");
		return RepeatStatus.FINISHED;
	}
	
	@Transactional
	private void preCheckData(Date checkDate){
		//更新渠道订单表中对账日以及对账日之前的数据为待对账
		updateChannelOrderPreCheck(checkDate);
		//把待对账的数据移到渠道订单待对账表中
		channelOrderExtendDao.moveDataToPreCheckSheet(checkDate);
		//删除渠道订单表中的待对账数据
		deleteChannelOrderPreCheck(checkDate);
	}
	
	private void updateChannelOrderPreCheck(Date checkDate){
		ChannelOrderExample example = new ChannelOrderExample();
		example.createCriteria().andTransDateLessThanOrEqualTo(checkDate);
		ChannelOrder channelOrder = new ChannelOrder();
		channelOrder.setCheckStatus(CheckStatus.PRECHECK);
		channelOrderMapper.updateByExampleSelective(channelOrder, example);
	}
	
	private void deleteChannelOrderPreCheck(Date checkDate){
		ChannelOrderExample example = new ChannelOrderExample();
		example.createCriteria().andTransDateLessThanOrEqualTo(checkDate).andCheckStatusEqualTo(CheckStatus.PRECHECK);
		channelOrderMapper.deleteByExample(example);
	}
	
}
