package com.sd.batch.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
//		log.info("start context destroyed...");
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
//			cronTriggerFactory.stopTimingTask(jobName);
//		}

	}
}
