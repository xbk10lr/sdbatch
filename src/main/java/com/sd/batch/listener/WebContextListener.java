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

import com.sd.batch.base.constants.JobConstants;
import com.sd.batch.base.constants.TaskStatus;
import com.sd.batch.dto.generate.JobTaskInfo;
import com.sd.batch.dto.generate.JobTaskInfoExample;
import com.sd.batch.mapper.JobTaskInfoMapper;
import com.sd.batch.schedule.AbstractQuarzJobBean;
import com.sd.batch.schedule.CronTriggerFactory;

/**
 * 容器初始化加载Job
 * @author Administrator
 *
 */
@WebListener
public class WebContextListener implements ServletContextListener {
	private static final Logger log = LoggerFactory.getLogger(WebContextListener.class);

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		log.info("start context initialized...");
		ServletContext application = sce.getServletContext();
		ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(application);
		CronTriggerFactory cronTriggerFactory = context.getBean(CronTriggerFactory.class);
		JobTaskInfoMapper jobtaskinfomaper = context.getBean(JobTaskInfoMapper.class);
		JobTaskInfoExample example = new JobTaskInfoExample();
		example.createCriteria().andTaskStatusEqualTo(TaskStatus.OPEN);
		List<JobTaskInfo> jobtasks = jobtaskinfomaper.selectByExample(example);
		//初始化收单日终任务
		for(JobTaskInfo entity:jobtasks) {
			String jobName = entity.getTaskName();
			String expression = entity.getTaskExpress();
			AbstractQuarzJobBean jobBean = (AbstractQuarzJobBean) context.getBean(jobName.trim()+JobConstants.QUARTZ_JOB_BEAN_SUFFIX);
			if(jobBean != null) {
				cronTriggerFactory.createTimingTask(expression, jobName, jobBean.getClass());
			}
		}

	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		log.info("start context destroyed...");
		ServletContext application = sce.getServletContext();
		ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(application);
		CronTriggerFactory cronTriggerFactory = context.getBean(CronTriggerFactory.class);
		JobTaskInfoMapper jobtaskinfomaper = context.getBean(JobTaskInfoMapper.class);
		JobTaskInfoExample example = new JobTaskInfoExample();
		example.createCriteria().andTaskStatusEqualTo(TaskStatus.OPEN);
		List<JobTaskInfo> jobtasks = jobtaskinfomaper.selectByExample(example);
		
		for(JobTaskInfo entity:jobtasks) {
			String jobName = entity.getTaskName();
			cronTriggerFactory.stopTimingTask(jobName);
		}

	}
}
