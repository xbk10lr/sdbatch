package com.sd.batch.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sd.batch.base.constants.JobConstants;
import com.sd.batch.base.utils.SpringUtils;
import com.sd.batch.base.utils.StringUtil;
import com.sd.batch.schedule.AbstractQuarzJobBean;
import com.sd.batch.schedule.CronTriggerFactory;
import com.sd.batch.service.AsyncService;

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
	private AsyncService asyncService;
	
	/**
	 * 重跑job
	 * @param jobName job名
	 * @return
	 */
	@RequestMapping("/restart")
	public Boolean jobsRestart(String jobName,String date,HttpServletResponse response) {
		log.info("start/restart job , jobName:"+jobName+", date:"+date);
		//跨域返回设置响应头
		response.setHeader("Access-Control-Allow-Origin", "*");
		//校验任务名是否为空
		if(StringUtil.isStringEmpty(jobName)){
			return false;
		} else {
			asyncService.runJob(jobName, date);
			return true;
		}
	}
	
	/**
	 * 续跑Job
	 * @param jobName
	 * @return
	 */
	@RequestMapping("/continue")
	public boolean jobsContinue(Long jobExecutionId,HttpServletResponse response) {
		log.info("continue job , jobExecutionId:"+jobExecutionId);
		//跨域返回设置响应头
		response.setHeader("Access-Control-Allow-Origin", "*");
		//校验任务名是否为空
		if(jobExecutionId == null){
			return false;
		} else {
			asyncService.continueJob(jobExecutionId);
			return true;
		}
	}
	
	/**
	 * 创建定时任务
	 * @param expression 表达式
	 * @param jobName job名
	 * @return
	 */
	@RequestMapping("/create")
	public boolean createJob(String expression,String jobName,HttpServletResponse response) {
		log.info("start create Job, expression:{},taskId:{}",expression,jobName);
		//跨域返回设置响应头
		response.setHeader("Access-Control-Allow-Origin", "*");
		AbstractQuarzJobBean jobBean = (AbstractQuarzJobBean) SpringUtils.getBeanObj(jobName.trim()+JobConstants.QUARTZ_JOB_BEAN_SUFFIX);
		boolean flag = cronTriggerFactory.createTimingTask(expression, jobName, jobBean.getClass());
		return flag;
	}
	
	/**
	 * 停止定时任务
	 * @param jobName job名
	 * @return
	 */
	@RequestMapping("/stop")
	public boolean stopJob(String jobName,HttpServletResponse response) {
		log.info("停止定时任务:{}",jobName);
		//跨域返回设置响应头
		response.setHeader("Access-Control-Allow-Origin", "*");
		boolean flag = cronTriggerFactory.stopTimingTask(jobName);
		return flag;
	}
}
