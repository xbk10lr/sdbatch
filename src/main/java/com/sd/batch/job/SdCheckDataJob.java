package com.sd.batch.job;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

//下载对账文件队列
@Slf4j
@Configuration
@EnableBatchProcessing
public class SdCheckDataJob {

	@Autowired
	private JobBuilderFactory jobBuilderFactory;
	
	@Autowired
	@Qualifier("parseCheckFileStep")
	private Step parseCheckFileStep;
	
	@Autowired
	@Qualifier("prepareCheckDataStep")
	private Step prepareCheckDataStep;
	
	@Autowired
	@Qualifier("checkDataStep")
	private Step checkDataStep;
	
	@Autowired
	@Qualifier("cleanDataStep")
	private Step cleanDataStep;
	
	@Autowired
	@Qualifier("clearDataStep")
	private Step clearDataStep;
	
	@Bean
	public Job checkDataJob() {
		log.info("down check file job start");
		return jobBuilderFactory.get("checkDataJob")
				.incrementer(new RunIdIncrementer())
				.start(parseCheckFileStep).next(prepareCheckDataStep).next(checkDataStep).next(clearDataStep).next(cleanDataStep)
				.build();
	}
}
