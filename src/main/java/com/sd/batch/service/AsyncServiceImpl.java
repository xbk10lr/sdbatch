package com.sd.batch.service;

import org.joda.time.DateTime;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.sd.batch.base.utils.DateUtil;
import com.sd.batch.base.utils.SpringUtils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class AsyncServiceImpl implements AsyncService{
	
	@Autowired
	private JobLauncher jobLauncher;
	
	@Async("taskExecutor")
	@Override
	public void runJob(String jobName, String date) {
		log.info("async run job service start......");
		Job job = (Job) SpringUtils.getBeanObj(jobName);
		JobParametersBuilder jobParameters = new JobParametersBuilder();
		if(StringUtils.hasText(date)) {
			jobParameters.addString("date", date);
		}else {
			jobParameters.addString("date", DateTime.now().minusDays(1).toString(DateUtil.DATE_FORMAT_YYYY_MM_DD));
		}
		jobParameters.addString("time", DateTime.now().toString(DateUtil.DATE_TIME_FORMAT_YYYY_MM_DD_HH_MI_SS));
		try {
			jobLauncher.run(job, jobParameters.toJobParameters());
		} catch (JobExecutionAlreadyRunningException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JobRestartException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JobInstanceAlreadyCompleteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JobParametersInvalidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void continueJob(String jobName, String date) {
		Job job = (Job) SpringUtils.getBeanObj(jobName);
		JobParametersBuilder jobParameters = new JobParametersBuilder();
		if(StringUtils.hasText(date)) {
			jobParameters.addString("date", date);
		}else {
			jobParameters.addString("date", DateTime.now().minusDays(1).toString(DateUtil.DATE_FORMAT_YYYY_MM_DD));
		}
		try {
			jobLauncher.run(job, jobParameters.toJobParameters());
		} catch (JobExecutionAlreadyRunningException e) {
			log.error("continue job error:{}",e);
		} catch (JobRestartException e) {
			log.error("continue job error:{}",e);
		} catch (JobInstanceAlreadyCompleteException e) {
			log.error("continue job error:{}",e);
		} catch (JobParametersInvalidException e) {
			log.error("continue job error:{}",e);
		}
	}
	
}
