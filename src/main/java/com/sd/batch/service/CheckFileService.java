package com.sd.batch.service;

import com.sd.batch.dto.common.ReqCheckFileApply;
import com.sd.batch.dto.common.RespCheckFileApply;

public interface CheckFileService {

	public RespCheckFileApply queryCheckFile(ReqCheckFileApply req);
	
}
