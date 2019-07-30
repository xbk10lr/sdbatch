package com.sd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@MapperScan("com.sd.batch.mapper")
@SpringBootApplication
@ServletComponentScan(basePackages = "com.sd.batch.listener")
public class UppBatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(UppBatchApplication.class, args);
	}

}

