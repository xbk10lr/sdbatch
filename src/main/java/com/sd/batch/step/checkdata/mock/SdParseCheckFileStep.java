package com.sd.batch.step.checkdata.mock;

import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sd.batch.listener.StepCommonListener;
import com.sd.batch.tasklet.checkdata.mock.ParseCheckFileTasklet;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class SdParseCheckFileStep {
	
	@Autowired
	private StepBuilderFactory stepBuilderFactory;
	
	@Autowired
	private StepCommonListener stepCommonListener;
	
	@Autowired
	private ParseCheckFileTasklet parseCheckFileTasklet;
	
	@Bean
	public Step parseCheckFileStep() {
		log.info("parse check file step start");
		return stepBuilderFactory.get("parseCheckFile")
				.tasklet(parseCheckFileTasklet)
				.listener(stepCommonListener)
				.build();
	}
	
}
