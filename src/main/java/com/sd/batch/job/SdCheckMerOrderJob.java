package com.sd.batch.job;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

/**
 * 商户对账队列
 *
 */
@Slf4j
@Configuration
@EnableBatchProcessing
public class SdCheckMerOrderJob {

	@Autowired
	private JobBuilderFactory jobBuilderFactory;
	
	@Autowired
	@Qualifier("prepareMerOrderStep")
	private Step prepareMerOrderStep;
	
	@Autowired
	@Qualifier("checkMerOrderStep")
	private Step checkMerOrderStep;
	
	@Autowired
	@Qualifier("clearMerOrderStep")
	private Step clearMerOrderStep;
	
	@Autowired
	@Qualifier("writeMerCheckFileStep")
	private Step writeMerCheckFileStep;
	
	@Autowired
	@Qualifier("cleanMerOrderStep")
	private Step cleanMerOrderStep;
	
	@Bean
	public Job checkDataJob() {
		log.info("down check file job start");
		return jobBuilderFactory.get("checkDataJob")
				.incrementer(new RunIdIncrementer())
				//对账数据准备
				.start(prepareMerOrderStep)
				//对账
				.next(checkMerOrderStep)
				//账单清分汇总
				.next(clearMerOrderStep)
				//生成商户对账文件
				.next(writeMerCheckFileStep)
				//商户订单清理
				.next(cleanMerOrderStep)
				.build();
	}
}
