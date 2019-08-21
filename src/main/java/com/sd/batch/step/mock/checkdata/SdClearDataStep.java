package com.sd.batch.step.mock.checkdata;

import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sd.batch.listener.StepCommonListener;
import com.sd.batch.tasklet.mock.checkdata.ClearDataTasklet;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class SdClearDataStep {
	
	@Autowired
	private StepBuilderFactory stepBuilderFactory;
	
	@Autowired
	private StepCommonListener stepCommonListener;
	
	@Autowired
	private ClearDataTasklet clearDataTasklet;
	
	@Bean
	public Step clearDataStep() {
		log.info("clear data step start");
		return stepBuilderFactory.get("clearData")
				.tasklet(clearDataTasklet)
				.listener(stepCommonListener)
				.build();
	}
	
}
