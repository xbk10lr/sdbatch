package com.sd.batch.dto.common;

import java.math.BigDecimal;

public class ClearMerOrder {

	private Integer totalCount;

	private Integer successCount;

	private Integer failCount;

	private Integer uncheckCount;

	private BigDecimal totalAmt;

	private BigDecimal successAmt;

	private BigDecimal failAmt;

	private BigDecimal uncheckAmt;
	
	private String merNo;

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getSuccessCount() {
		return successCount;
	}

	public void setSuccessCount(Integer successCount) {
		this.successCount = successCount;
	}

	public Integer getFailCount() {
		return failCount;
	}

	public void setFailCount(Integer failCount) {
		this.failCount = failCount;
	}

	public Integer getUncheckCount() {
		return uncheckCount;
	}

	public void setUncheckCount(Integer uncheckCount) {
		this.uncheckCount = uncheckCount;
	}

	public BigDecimal getTotalAmt() {
		return totalAmt;
	}

	public void setTotalAmt(BigDecimal totalAmt) {
		this.totalAmt = totalAmt;
	}

	public BigDecimal getSuccessAmt() {
		return successAmt;
	}

	public void setSuccessAmt(BigDecimal successAmt) {
		this.successAmt = successAmt;
	}

	public BigDecimal getFailAmt() {
		return failAmt;
	}

	public void setFailAmt(BigDecimal failAmt) {
		this.failAmt = failAmt;
	}

	public BigDecimal getUncheckAmt() {
		return uncheckAmt;
	}

	public void setUncheckAmt(BigDecimal uncheckAmt) {
		this.uncheckAmt = uncheckAmt;
	}

	public String getMerNo() {
		return merNo;
	}

	public void setMerNo(String merNo) {
		this.merNo = merNo;
	}

}
