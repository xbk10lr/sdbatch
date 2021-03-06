package com.sd.batch.step.test;

import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sd.batch.listener.StepCommonListener;
import com.sd.batch.tasklet.test.Test1Tasklet;
import com.sd.batch.tasklet.test.Test1Tasklet2;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class TestStep1 {
	
	@Autowired
	private StepBuilderFactory stepBuilderFactory;
	
	@Autowired
	private StepCommonListener stepCommonListener;
	
	@Autowired
	private Test1Tasklet test1Tasklet;
	
	@Autowired
	private Test1Tasklet2 test1Tasklet2;
	
	@Bean
	public Step test1Step() {
		log.info("测试步点1启动");
		return stepBuilderFactory.get("test1")
				.tasklet(test1Tasklet).tasklet(test1Tasklet2)
				.listener(stepCommonListener)
				.build();
	}
	
}
