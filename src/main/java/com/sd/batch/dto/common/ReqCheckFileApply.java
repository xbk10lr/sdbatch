package com.sd.batch.dto.common;

/**
 * 申请对账文件 请求类
 * @author Administrator
 *
 */
public class ReqCheckFileApply {

	/**
	 * 商户号
	 */
	private String mernbr;
	
	/**
	 * 对账日期
	 */
	private String checkDate;

	public String getMernbr() {
		return mernbr;
	}

	public void setMernbr(String mernbr) {
		this.mernbr = mernbr;
	}

	public String getCheckDate() {
		return checkDate;
	}

	public void setCheckDate(String checkDate) {
		this.checkDate = checkDate;
	}

	@Override
	public String toString() {
		return "ReqCheckFileApply [mernbr=" + mernbr + ", checkDate=" + checkDate + "]";
	}
	
}
