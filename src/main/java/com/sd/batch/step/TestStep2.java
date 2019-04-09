package com.sd.batch.step;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sd.batch.listener.StepCommonListener;
import com.sd.batch.tasklet.Test2Tasklet;

@Configuration
public class TestStep2 {
	private static final Logger log = LoggerFactory.getLogger(TestStep2.class);

	@Autowired
	private StepBuilderFactory stepBuilderFactory;
	
	@Autowired
	private StepCommonListener stepCommonListener;
	
	@Autowired
	private Test2Tasklet test2Tasklet;
	
	@Bean
	public Step test2Step() {
		log.info("测试步点2启动");
		return stepBuilderFactory.get("test2")
				.tasklet(test2Tasklet)
				.listener(stepCommonListener)
				.build();
	}
}
