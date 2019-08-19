package com.sd.batch.step.mock.checkdata;

import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sd.batch.listener.StepCommonListener;
import com.sd.batch.tasklet.mock.checkdata.CleanDataTasklet;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class SdCleanDataStep {
	
	@Autowired
	private StepBuilderFactory stepBuilderFactory;
	
	@Autowired
	private StepCommonListener stepCommonListener;
	
	@Autowired
	private CleanDataTasklet cleanDataTasklet;
	
	@Bean
	public Step cleanDataStep() {
		log.info("clean data step start");
		return stepBuilderFactory.get("cleanData")
				.tasklet(cleanDataTasklet)
				.listener(stepCommonListener)
				.build();
	}
	
}
