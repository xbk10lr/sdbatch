package com.sd.batch.dto.generate;

import java.math.BigDecimal;
import java.util.Date;

public class ChannelOrderSum {
    private String settleNbr;

    private String channelCode;

    private Date clearDate;

    private Date clearTime;

    private BigDecimal totalAmt;

    private BigDecimal totalSuccessAmt;

    private BigDecimal totalFailAmt;

    private BigDecimal totalUncheckAmt;

    private Integer totalCount;

    private Integer totalSuccessCount;

    private Integer totalFailCount;

    private Integer totalUncheckCount;

    private BigDecimal totalFeeAmt;

    public String getSettleNbr() {
        return settleNbr;
    }

    public void setSettleNbr(String settleNbr) {
        this.settleNbr = settleNbr == null ? null : settleNbr.trim();
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode == null ? null : channelCode.trim();
    }

    public Date getClearDate() {
        return clearDate;
    }

    public void setClearDate(Date clearDate) {
        this.clearDate = clearDate;
    }

    public Date getClearTime() {
        return clearTime;
    }

    public void setClearTime(Date clearTime) {
        this.clearTime = clearTime;
    }

    public BigDecimal getTotalAmt() {
        return totalAmt;
    }

    public void setTotalAmt(BigDecimal totalAmt) {
        this.totalAmt = totalAmt;
    }

    public BigDecimal getTotalSuccessAmt() {
        return totalSuccessAmt;
    }

    public void setTotalSuccessAmt(BigDecimal totalSuccessAmt) {
        this.totalSuccessAmt = totalSuccessAmt;
    }

    public BigDecimal getTotalFailAmt() {
        return totalFailAmt;
    }

    public void setTotalFailAmt(BigDecimal totalFailAmt) {
        this.totalFailAmt = totalFailAmt;
    }

    public BigDecimal getTotalUncheckAmt() {
        return totalUncheckAmt;
    }

    public void setTotalUncheckAmt(BigDecimal totalUncheckAmt) {
        this.totalUncheckAmt = totalUncheckAmt;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getTotalSuccessCount() {
        return totalSuccessCount;
    }

    public void setTotalSuccessCount(Integer totalSuccessCount) {
        this.totalSuccessCount = totalSuccessCount;
    }

    public Integer getTotalFailCount() {
        return totalFailCount;
    }

    public void setTotalFailCount(Integer totalFailCount) {
        this.totalFailCount = totalFailCount;
    }

    public Integer getTotalUncheckCount() {
        return totalUncheckCount;
    }

    public void setTotalUncheckCount(Integer totalUncheckCount) {
        this.totalUncheckCount = totalUncheckCount;
    }

    public BigDecimal getTotalFeeAmt() {
        return totalFeeAmt;
    }

    public void setTotalFeeAmt(BigDecimal totalFeeAmt) {
        this.totalFeeAmt = totalFeeAmt;
    }
}