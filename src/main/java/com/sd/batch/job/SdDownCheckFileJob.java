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

//下周对账文件队列
@Slf4j
@Configuration
@EnableBatchProcessing
public class SdDownCheckFileJob {

	@Autowired
	private JobBuilderFactory jobBuilderFactory;
	
	@Autowired
	@Qualifier("downCheckFileStep")
	private Step downCheckFileStep;
	
	@Bean
	public Job downCheckFileJob() {
		log.info("down check file job start");
		return jobBuilderFactory.get("downCheckFileJob")
				.incrementer(new RunIdIncrementer())
				.start(downCheckFileStep)
				.build();
	}
}
