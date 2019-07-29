package com.sd.batch.tasklet;

import java.util.Date;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sd.constants.SysNbr;
import com.sd.dao.mapper.SysinfoMapper;
import com.sd.dto.generate.Sysinfo;
import com.sd.utils.DateUtil;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class CutOffTasklet implements Tasklet{

	@Autowired
	private SysinfoMapper sysinfoMapper;
	
	@Override
	public RepeatStatus execute(StepContribution arg0, ChunkContext arg1) throws Exception {
		log.info("cut off tasklet start");
		Sysinfo sysinfo = sysinfoMapper.selectByPrimaryKey(SysNbr.BATCH_NAME);
		Date predate = sysinfo.getPredate();
		Date nowdate = sysinfo.getNowdate();
		Date nextdate = sysinfo.getNextdate();
		log.info("当前系统日期："+sysinfo.toString());
		sysinfo.setPredate(DateUtil.addDate(predate, 0, 0, 1, 0, 0, 0, 0));
		sysinfo.setNowdate(DateUtil.addDate(nowdate, 0, 0, 1, 0, 0, 0, 0));
		sysinfo.setNextdate(DateUtil.addDate(nextdate, 0, 0, 1, 0, 0, 0, 0));
		sysinfoMapper.updateByPrimaryKeySelective(sysinfo);
		log.info("更新成功,系统日期"+sysinfo.toString());
		return RepeatStatus.FINISHED;
	}

	
}
