package com.sd.batch.step;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sd.batch.listener.StepCommonListener;
import com.sd.batch.tasklet.Test1Tasklet;

@Configuration
public class TestStep1 {
	private static final Logger log = LoggerFactory.getLogger(TestStep1.class);
	
	@Autowired
	private StepBuilderFactory stepBuilderFactory;
	
	@Autowired
	private StepCommonListener stepCommonListener;
	
	@Autowired
	private Test1Tasklet test1Tasklet;
	
	@Bean
	public Step test1Step() {
		log.info("测试步点1启动");
		return stepBuilderFactory.get("test1")
				.tasklet(test1Tasklet)
				.listener(stepCommonListener)
				.build();
	}
	
}
