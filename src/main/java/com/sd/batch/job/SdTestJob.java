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

import com.sd.batch.listener.JobCommonListener;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
@EnableBatchProcessing
public class SdTestJob {

	@Autowired
	private JobBuilderFactory jobBuilderFactory;
	
	@Autowired
	@Qualifier("test1Step")
	private Step test1Step;
	
	@Autowired
	@Qualifier("test2Step")
	private Step test2Step;
	
	@Autowired
	@Qualifier("test3Step")
	private Step test3Step;
	
	@Autowired
	private JobCommonListener jobCommonListener; 
	
	@Bean
	public Job testJob() {
		log.info("testjob start");
		return jobBuilderFactory.get("testJob")
				.incrementer(new RunIdIncrementer())
				.start(test1Step)
				.next(test2Step)
				.next(test3Step)
				.listener(jobCommonListener)
				.build();
	}
}
