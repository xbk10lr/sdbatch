package com.sd.batch.step.checkdata;

import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sd.batch.listener.StepCommonListener;
import com.sd.batch.tasklet.checkdata.InitCheckFileTasklet;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class SdInitCheckFileStep {
	
	@Autowired
	private StepBuilderFactory stepBuilderFactory;
	
	@Autowired
	private StepCommonListener stepCommonListener;
	
	@Autowired
	private InitCheckFileTasklet initCheckFileTasklet;
	
	@Bean
	public Step initCheckFileStep() {
		log.info("init check file step start");
		return stepBuilderFactory.get("initCheckFile")
				.tasklet(initCheckFileTasklet)
				.listener(stepCommonListener)
				.build();
	}
	
}
