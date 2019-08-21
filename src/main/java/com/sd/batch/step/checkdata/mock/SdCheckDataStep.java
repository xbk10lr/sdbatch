package com.sd.batch.step.checkdata.mock;

import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sd.batch.listener.StepCommonListener;
import com.sd.batch.tasklet.checkdata.mock.CheckDataTasklet;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class SdCheckDataStep {
	
	@Autowired
	private StepBuilderFactory stepBuilderFactory;
	
	@Autowired
	private StepCommonListener stepCommonListener;
	
	@Autowired
	private CheckDataTasklet checkDataTasklet;
	
	@Bean
	public Step checkDataStep() {
		log.info("check data step start");
		return stepBuilderFactory.get("checkData")
				.tasklet(checkDataTasklet)
				.listener(stepCommonListener)
				.build();
	}
	
}
