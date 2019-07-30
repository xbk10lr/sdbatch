package com.sd.dto.generate;

import java.math.BigDecimal;
import java.util.Date;

public class MerOrder {
    private String platSeqNbr;

    private Date transDate;

    private String payerName;

    private BigDecimal transAmt;

    private BigDecimal merFeeAmt;

    private String merSeqNbr;

    private String merNo;

    private Date transTime;

    private Date checkDate;

    private String checkStatus;

    private String orderStatus;

    private String respMsg;

    private String respCode;

    private Date crtDateTime;

    private Date dateLastmaint;

    public String getPlatSeqNbr() {
        return platSeqNbr;
    }

    public void setPlatSeqNbr(String platSeqNbr) {
        this.platSeqNbr = platSeqNbr == null ? null : platSeqNbr.trim();
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

    public BigDecimal getMerFeeAmt() {
        return merFeeAmt;
    }

    public void setMerFeeAmt(BigDecimal merFeeAmt) {
        this.merFeeAmt = merFeeAmt;
    }

    public String getMerSeqNbr() {
        return merSeqNbr;
    }

    public void setMerSeqNbr(String merSeqNbr) {
        this.merSeqNbr = merSeqNbr == null ? null : merSeqNbr.trim();
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

    public String getRespMsg() {
        return respMsg;
    }

    public void setRespMsg(String respMsg) {
        this.respMsg = respMsg == null ? null : respMsg.trim();
    }

    public String getRespCode() {
        return respCode;
    }

    public void setRespCode(String respCode) {
        this.respCode = respCode == null ? null : respCode.trim();
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