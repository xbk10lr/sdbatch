package com.sd.batch.tasklet.cutoff;

import java.util.Date;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sd.batch.base.constants.SysNbr;
import com.sd.batch.base.utils.DateUtil;
import com.sd.batch.dto.generate.SysInfo;
import com.sd.batch.mapper.SysInfoMapper;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class CutOffTasklet implements Tasklet{

	@Autowired
	private SysInfoMapper sysInfoMapper;
	
	@Override
	public RepeatStatus execute(StepContribution arg0, ChunkContext arg1) throws Exception {
		log.info("cut off tasklet start");
		SysInfo sysInfo = sysInfoMapper.selectByPrimaryKey(SysNbr.BATCH_NAME);
		Date predate = sysInfo.getPreDate();
		Date nowdate = sysInfo.getNowDate();
		Date nextdate = sysInfo.getNextDate();
		log.info("当前系统日期："+sysInfo.toString());
		sysInfo.setPreDate(DateUtil.addDate(predate, 0, 0, 1, 0, 0, 0, 0));
		sysInfo.setNowDate(DateUtil.addDate(nowdate, 0, 0, 1, 0, 0, 0, 0));
		sysInfo.setNextDate(DateUtil.addDate(nextdate, 0, 0, 1, 0, 0, 0, 0));
		sysInfoMapper.updateByPrimaryKeySelective(sysInfo);
		log.info("更新成功,系统日期"+sysInfo.toString());
		return RepeatStatus.FINISHED;
	}
}
