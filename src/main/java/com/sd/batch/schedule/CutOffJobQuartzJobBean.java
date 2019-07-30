package com.sd.batch.schedule;

import org.springframework.stereotype.Component;

@Component
public class CutOffJobQuartzJobBean extends AbstractQuarzJobBean{

	@Override
	protected String getJobName() {
		return "cutOffJob";
	}

}
