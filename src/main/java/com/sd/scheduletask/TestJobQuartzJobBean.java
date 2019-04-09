package com.sd.scheduletask;

public class TestJobQuartzJobBean extends AbstractQuarzJobBean{

	@Override
	protected String getJobName() {
		return "testJob";
	}

}
