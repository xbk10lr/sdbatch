package com.sd.batch.step.test;

import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sd.batch.listener.StepCommonListener;
import com.sd.batch.tasklet.test.Test3Tasklet;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class TestStep3 {

	@Autowired
	private StepBuilderFactory stepBuilderFactory;
	
	@Autowired
	private StepCommonListener stepCommonListener;
	
	@Autowired
	private Test3Tasklet test3Tasklet;
	
	@Bean
	public Step test3Step() {
		log.info("测试步点3启动");
		return stepBuilderFactory.get("test3")
				.tasklet(test3Tasklet)
				.listener(stepCommonListener)
				.build();
	}
}
