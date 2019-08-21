package com.sd.batch.step.checkdata.mock;

import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sd.batch.listener.StepCommonListener;
import com.sd.batch.tasklet.checkdata.mock.DownCheckFileTasklet;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class SdDownCheckFileStep {
	
	@Autowired
	private StepBuilderFactory stepBuilderFactory;
	
	@Autowired
	private StepCommonListener stepCommonListener;
	
	@Autowired
	private DownCheckFileTasklet downCheckFileTasklet;
	
	@Bean
	public Step downCheckFileStep() {
		log.info("down check file step start");
		return stepBuilderFactory.get("downCheckFile")
				.tasklet(downCheckFileTasklet)
				.listener(stepCommonListener)
				.build();
	}
	
}
