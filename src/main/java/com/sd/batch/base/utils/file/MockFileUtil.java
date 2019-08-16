package com.sd.batch.base.utils.file;

import java.math.BigDecimal;
import java.util.Map;

import com.sd.batch.base.constants.ChannelCode;
import com.sd.batch.base.constants.CheckStatus;
import com.sd.batch.base.utils.DateUtil;
import com.sd.batch.dto.generate.DownOrder;

public class MockFileUtil extends BaseFileUtil{

	@Override
	protected DownOrder parseMapToDownOrder(Map<String, String> map) {
		DownOrder downOrder = new DownOrder();
		downOrder.setChannelCode(ChannelCode.MOCK);
		downOrder.setCheckStatus(CheckStatus.PRECHECK);
		downOrder.setOrderSeqNbr(map.get("sdptlsh"));
		downOrder.setOrderStatus("0");
		downOrder.setTransDate(DateUtil.parseStrToDate(map.get("sdptjyrq"), DateUtil.DATE_FORMAT_YYYYMMDD));
		downOrder.setTransAmt(new BigDecimal(map.get("jyje")));
		downOrder.setDownSeqNbr(map.get("xylsh"));
		return downOrder;
	}

}
