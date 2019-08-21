package com.sd.batch.step.checkmer;

import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sd.batch.listener.StepCommonListener;
import com.sd.batch.tasklet.checkmer.CleanMerOrderTasklet;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class SdCleanMerOrderStep {
	
	@Autowired
	private StepBuilderFactory stepBuilderFactory;
	
	@Autowired
	private StepCommonListener stepCommonListener;
	
	@Autowired
	private CleanMerOrderTasklet cleanMerOrderTasklet;
	
	@Bean
	public Step cleanMerOrderStep() {
		log.info("CleanMerOrder step start");
		return stepBuilderFactory.get("cleanMerOrder")
				.tasklet(cleanMerOrderTasklet)
				.listener(stepCommonListener)
				.build();
	}
	
}
