package com.sd.batch.base.constants;

public enum ErrorTypEnum {
	
	/**
	 * 交易金额不一致
	 */
	 AMT_NOT_EQUAL ("amtNotEqual","交易金额不一致"),
	/**
	 * 收单平台成功，下游失败
	 */
	UP_SUCCESS_DOWN_FAIL ("upSuccessDownFail","收单平台成功，下游失败");
	
	private final String errorTyp;
	
	private final String errorDesc;
	
	private ErrorTypEnum(String errorTyp,String errorDesc){
		this.errorTyp = errorTyp;
		this.errorDesc = errorDesc;
	}

	public String getErrorTyp() {
		return errorTyp;
	}

	public String getErrorDesc() {
		return errorDesc;
	}
	
}
