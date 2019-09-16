package com.sd.batch.dto.generate;

import java.math.BigDecimal;
import java.util.Date;

public class ChannelOrder {
    private String orderSeqNbr;

    private Date transDate;

    private String payerName;

    private BigDecimal transAmt;

    private BigDecimal channelFeeAmt;

    private String channelCode;

    private String platSeqNbr;

    private String downSeqNbr;

    private String returnCode;

    private String returnMsg;

    private String merNo;

    private Date transTime;

    private Date checkDate;

    private String checkStatus;

    private String orderStatus;

    private Date crtDateTime;

    private Date dateLastmaint;

    public String getOrderSeqNbr() {
        return orderSeqNbr;
    }

    public void setOrderSeqNbr(String orderSeqNbr) {
        this.orderSeqNbr = orderSeqNbr == null ? null : orderSeqNbr.trim();
    }

    public Date getTransDate() {
        return transDate;
    }

    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public String getPayerName() {
        return payerName;
    }

    public void setPayerName(String payerName) {
        this.payerName = payerName == null ? null : payerName.trim();
    }

    public BigDecimal getTransAmt() {
        return transAmt;
    }

    public void setTransAmt(BigDecimal transAmt) {
        this.transAmt = transAmt;
    }

    public BigDecimal getChannelFeeAmt() {
        return channelFeeAmt;
    }

    public void setChannelFeeAmt(BigDecimal channelFeeAmt) {
        this.channelFeeAmt = channelFeeAmt;
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode == null ? null : channelCode.trim();
    }

    public String getPlatSeqNbr() {
        return platSeqNbr;
    }

    public void setPlatSeqNbr(String platSeqNbr) {
        this.platSeqNbr = platSeqNbr == null ? null : platSeqNbr.trim();
    }

    public String getDownSeqNbr() {
        return downSeqNbr;
    }

    public void setDownSeqNbr(String downSeqNbr) {
        this.downSeqNbr = downSeqNbr == null ? null : downSeqNbr.trim();
    }

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode == null ? null : returnCode.trim();
    }

    public String getReturnMsg() {
        return returnMsg;
    }

    public void setReturnMsg(String returnMsg) {
        this.returnMsg = returnMsg == null ? null : returnMsg.trim();
    }

    public String getMerNo() {
        return merNo;
    }

    public void setMerNo(String merNo) {
        this.merNo = merNo == null ? null : merNo.trim();
    }

    public Date getTransTime() {
        return transTime;
    }

    public void setTransTime(Date transTime) {
        this.transTime = transTime;
    }

    public Date getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(Date checkDate) {
        this.checkDate = checkDate;
    }

    public String getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(String checkStatus) {
        this.checkStatus = checkStatus == null ? null : checkStatus.trim();
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }

    public Date getCrtDateTime() {
        return crtDateTime;
    }

    public void setCrtDateTime(Date crtDateTime) {
        this.crtDateTime = crtDateTime;
    }

    public Date getDateLastmaint() {
        return dateLastmaint;
    }

    public void setDateLastmaint(Date dateLastmaint) {
        this.dateLastmaint = dateLastmaint;
    }
}