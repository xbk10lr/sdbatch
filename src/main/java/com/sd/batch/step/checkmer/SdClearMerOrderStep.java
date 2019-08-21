package com.sd.batch.step.checkmer;

import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sd.batch.listener.StepCommonListener;
import com.sd.batch.tasklet.checkmer.ClearMerOrderTasklet;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class SdClearMerOrderStep {
	
	@Autowired
	private StepBuilderFactory stepBuilderFactory;
	
	@Autowired
	private StepCommonListener stepCommonListener;
	
	@Autowired
	private ClearMerOrderTasklet clearMerOrderTasklet;
	
	@Bean
	public Step clearMerOrderStep() {
		log.info("clearMerOrder step start");
		return stepBuilderFactory.get("clearMerOrder")
				.tasklet(clearMerOrderTasklet)
				.listener(stepCommonListener)
				.build();
	}
	
}
