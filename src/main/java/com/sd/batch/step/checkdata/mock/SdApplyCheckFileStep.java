package com.sd.batch.step.checkdata.mock;

import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sd.batch.listener.StepCommonListener;
import com.sd.batch.tasklet.checkdata.mock.ApplyCheckFileTasklet;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class SdApplyCheckFileStep {
	
	@Autowired
	private StepBuilderFactory stepBuilderFactory;
	
	@Autowired
	private StepCommonListener stepCommonListener;
	
	@Autowired
	private ApplyCheckFileTasklet applyCheckFileTasklet;
	
	@Bean
	public Step applyCheckFileStep() {
		log.info("apply check file step start");
		return stepBuilderFactory.get("applyCheckFile")
				.tasklet(applyCheckFileTasklet)
				.listener(stepCommonListener)
				.build();
	}
	
}
