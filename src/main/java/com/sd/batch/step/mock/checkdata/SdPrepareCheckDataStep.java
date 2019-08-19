package com.sd.batch.step.mock.checkdata;

import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sd.batch.listener.StepCommonListener;
import com.sd.batch.tasklet.mock.checkdata.PrepareCheckDataTasklet;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class SdPrepareCheckDataStep {
	
	@Autowired
	private StepBuilderFactory stepBuilderFactory;
	
	@Autowired
	private StepCommonListener stepCommonListener;
	
	@Autowired
	private PrepareCheckDataTasklet prepareCheckDataTasklet;
	
	@Bean
	public Step prepareCheckDataStep() {
		log.info("prepare check data step start");
		return stepBuilderFactory.get("prepareCheckData")
				.tasklet(prepareCheckDataTasklet)
				.listener(stepCommonListener)
				.build();
	}
	
}
