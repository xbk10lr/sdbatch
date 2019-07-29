package com.sd.schedule;

public class TestJobQuartzJobBean extends AbstractQuarzJobBean{

	@Override
	protected String getJobName() {
		return "testJob";
	}

}
