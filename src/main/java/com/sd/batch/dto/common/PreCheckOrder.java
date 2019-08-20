package com.sd.batch.dto.common;

import java.math.BigDecimal;
import java.util.Date;

public class PreCheckOrder {
	
	private String orderSeqNbr;
	
	private Date transDate;
	
	private BigDecimal transAmt;
	
	private BigDecimal downTransAmt;
	
	private String downExist;
	
	private String channelCode;
	
	private Date transTime;
	
	private String platSeqNbr;
	
	private String checkStatus;
	
	private String orderStatus;
	
	private String downOrderStatus;

	public String getOrderSeqNbr() {
		return orderSeqNbr;
	}

	public void setOrderSeqNbr(String orderSeqNbr) {
		this.orderSeqNbr = orderSeqNbr;
	}

	public Date getTransDate() {
		return transDate;
	}

	public void setTransDate(Date transDate) {
		this.transDate = transDate;
	}

	public BigDecimal getTransAmt() {
		return transAmt;
	}

	public void setTransAmt(BigDecimal transAmt) {
		this.transAmt = transAmt;
	}

	public BigDecimal getDownTransAmt() {
		return downTransAmt;
	}

	public void setDownTransAmt(BigDecimal downTransAmt) {
		this.downTransAmt = downTransAmt;
	}

	public String getDownExist() {
		return downExist;
	}

	public void setDownExist(String downExist) {
		this.downExist = downExist;
	}

	public String getChannelCode() {
		return channelCode;
	}

	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	public Date getTransTime() {
		return transTime;
	}

	public void setTransTime(Date transTime) {
		this.transTime = transTime;
	}

	public String getPlatSeqNbr() {
		return platSeqNbr;
	}

	public void setPlatSeqNbr(String platSeqNbr) {
		this.platSeqNbr = platSeqNbr;
	}

	public String getCheckStatus() {
		return checkStatus;
	}

	public void setCheckStatus(String checkStatus) {
		this.checkStatus = checkStatus;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getDownOrderStatus() {
		return downOrderStatus;
	}

	public void setDownOrderStatus(String downOrderStatus) {
		this.downOrderStatus = downOrderStatus;
	}
}
