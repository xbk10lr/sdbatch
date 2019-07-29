package com.sd.batch.listener;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.sd.dao.mapper.JobtaskinfoMapper;
import com.sd.dto.generate.Jobtaskinfo;
import com.sd.dto.generate.JobtaskinfoExample;
import com.sd.schedule.AbstractQuarzJobBean;
import com.sd.schedule.CronTriggerFactory;

/**
 * 容器初始化加载Job
 * @author Administrator
 *
 */
//@WebListener
public class WebContextListener implements ServletContextListener {
	private static final Logger log = LoggerFactory.getLogger(WebContextListener.class);

	private static final String QUARTZ_JOB_BEAN_SUFFIX = "QuartzJobBean";
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
//		log.info("start context initialized...");
//		ServletContext application = sce.getServletContext();
//		ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(application);
//		CronTriggerFactory cronTriggerFactory = context.getBean(CronTriggerFactory.class);
//		JobtaskinfoMapper jobtaskinfomaper = context.getBean(JobtaskinfoMapper.class);
//		JobtaskinfoExample example = new JobtaskinfoExample();
//		example.createCriteria().andSysidEqualTo("sd").andTaskstatusEqualTo("0");
//		List<Jobtaskinfo> jobtasks = jobtaskinfomaper.selectByExample(example);
//		
//		for(Jobtaskinfo entity:jobtasks) {
//			String jobName = entity.getTaskname();
//			String expression = entity.getTaskexpress();
//			AbstractQuarzJobBean jobBean = (AbstractQuarzJobBean) context.getBean(jobName.trim()+QUARTZ_JOB_BEAN_SUFFIX);
//			if(jobBean != null) {
//				cronTriggerFactory.createTimingTask(expression, jobName, jobBean.getClass());
//			}
//		}

	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		log.info("start context destroyed...");
		ServletContext application = sce.getServletContext();
		ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(application);
		CronTriggerFactory cronTriggerFactory = context.getBean(CronTriggerFactory.class);
		JobtaskinfoMapper jobtaskinfomaper = context.getBean(JobtaskinfoMapper.class);
		JobtaskinfoExample example = new JobtaskinfoExample();
		example.createCriteria().andSysidEqualTo("sd").andTaskstatusEqualTo("0");
		List<Jobtaskinfo> jobtasks = jobtaskinfomaper.selectByExample(example);
		
		for(Jobtaskinfo entity:jobtasks) {
			String jobName = entity.getTaskname();
			cronTriggerFactory.stopTimingTask(jobName);
		}

	}
}
