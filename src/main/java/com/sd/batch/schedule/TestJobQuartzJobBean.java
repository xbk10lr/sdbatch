package com.sd.batch.schedule;

import org.springframework.stereotype.Component;

@Component
public class TestJobQuartzJobBean extends AbstractQuarzJobBean{

	@Override
	protected String getJobName() {
		return "testJob";
	}

}
