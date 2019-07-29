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

//日切队列
@Slf4j
@Configuration
@EnableBatchProcessing
public class SdCutOffJob {

	@Autowired
	private JobBuilderFactory jobBuilderFactory;
	
	@Autowired
	@Qualifier("cutOffStep")
	private Step cutOffStep;
	
	@Bean
	public Job cutOffJob() {
		log.info("cut off job start");
		return jobBuilderFactory.get("cutOffJob")
				.incrementer(new RunIdIncrementer())
				.start(cutOffStep)
				.build();
	}
}
