package com.sd.batch.step.cutoff;

import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sd.batch.listener.StepCommonListener;
import com.sd.batch.tasklet.cutoff.CutOffTasklet;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class SdCutOffStep {
	
	@Autowired
	private StepBuilderFactory stepBuilderFactory;
	
	@Autowired
	private StepCommonListener stepCommonListener;
	
	@Autowired
	private CutOffTasklet cutOffTasklet;
	
	@Bean
	public Step cutOffStep() {
		log.info("cut off step start");
		return stepBuilderFactory.get("cutOff")
				.tasklet(cutOffTasklet)
				.listener(stepCommonListener)
				.build();
	}
	
}
