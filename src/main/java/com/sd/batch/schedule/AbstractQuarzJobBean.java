package com.sd.batch.schedule;

import org.joda.time.DateTime;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import com.sd.batch.base.constants.JobParameteresKey;
import com.sd.batch.base.constants.SysNbr;
import com.sd.batch.base.utils.DateUtil;
import com.sd.batch.base.utils.SpringUtils;
import com.sd.batch.mapper.SysInfoMapper;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class AbstractQuarzJobBean extends QuartzJobBean {

	protected abstract String getJobName();

	@Override
	protected void executeInternal(JobExecutionContext arg0) throws JobExecutionException {
		try {
			Job job = (Job) SpringUtils.getBeanObj(getJobName());
			JobLauncher jobLauncher = (JobLauncher) SpringUtils.getBeanObj("jobLauncher");
			SysInfoMapper sysInfoMapper = SpringUtils.getBean(SysInfoMapper.class);
			JobParameters jobParameters = new JobParametersBuilder()
					.addString(JobParameteresKey.NOW_DATE_STR, DateTime.now().minusDays(1).toString(DateUtil.DATE_FORMAT_YYYY_MM_DD))
					.addDate(JobParameteresKey.CHECK_DATE, sysInfoMapper.selectByPrimaryKey(SysNbr.BATCH_NAME).getPreDate())
					.toJobParameters();
			jobLauncher.run(job, jobParameters);
		} catch (JobExecutionAlreadyRunningException e) {
			log.error("JobExecutionAlreadyRunningException error:{}", e);
		} catch (JobRestartException e) {
			log.error("JobRestartException error:{}", e);
		} catch (JobInstanceAlreadyCompleteException e) {
			log.error("JobInstanceAlreadyCompleteException error:{}", e);
		} catch (JobParametersInvalidException e) {
			log.error("JobParametersInvalidException error:{}", e);
		} catch (Exception e) {
			log.error("exception:{}", e);
		}

	}

}
