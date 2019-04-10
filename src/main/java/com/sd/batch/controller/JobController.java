package com.sd.batch.controller;

import org.joda.time.DateTime;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sd.base.DateUtil;
import com.sd.base.SpringUtils;
import com.sd.scheduletask.CronTriggerFactory;
import com.sd.scheduletask.DataPrepareYfbQuartzJobBean;

import lombok.extern.slf4j.Slf4j;

/**
 * 任务控制器，用于对外提供触发任务队列的接口
 * @author Administrator
 *
 */
@Slf4j
@RestController
@RequestMapping("/jobs")
public class JobController {
	
	@Autowired
	private CronTriggerFactory cronTriggerFactory;
	
	@Autowired
	private JobLauncher jobLauncher;
	
	/**
	 * 重跑job
	 * @param jobName job名
	 * @return
	 */
	@RequestMapping("/restart")
	public boolean jobsRestart(String jobName,String date) {
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
			return true;
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
		return false;
	}
	
	/**
	 * 续跑Job
	 * @param jobName
	 * @return
	 */
	@RequestMapping("/continue")
	public boolean jobsContinue(String jobName,String date) {
		Job job = (Job) SpringUtils.getBeanObj(jobName);
		JobParametersBuilder jobParameters = new JobParametersBuilder();
		if(StringUtils.hasText(date)) {
			jobParameters.addString("date", date);
		}else {
			jobParameters.addString("date", DateTime.now().minusDays(1).toString(DateUtil.DATE_FORMAT_YYYY_MM_DD));
		}
		try {
			jobLauncher.run(job, jobParameters.toJobParameters());
			return true;
		} catch (JobExecutionAlreadyRunningException e) {
			log.error("continue job error:{}",e);
		} catch (JobRestartException e) {
			log.error("continue job error:{}",e);
		} catch (JobInstanceAlreadyCompleteException e) {
			log.error("continue job error:{}",e);
		} catch (JobParametersInvalidException e) {
			log.error("continue job error:{}",e);
		}
		return false;
	}
	
	/**
	 * 创建定时任务
	 * @param expression 表达式
	 * @param jobName job名
	 * @return
	 */
	@RequestMapping("/create")
	public boolean createJob(String expression,String jobName) {
		log.info("expression:{},taskId:{}",expression,jobName);
		boolean flag = cronTriggerFactory.createTimingTask(expression, jobName, DataPrepareYfbQuartzJobBean.class);
		return flag;
	}
	
	/**
	 * 停止定时任务
	 * @param jobName job名
	 * @return
	 */
	@RequestMapping("/stop")
	public boolean stopJob(String jobName) {
		log.info("停止定时任务:{}",jobName);
		boolean flag = cronTriggerFactory.stopTimingTask(jobName);
		return flag;
	}
}
