package com.sd.batch.dto.generate;

import java.math.BigDecimal;
import java.util.Date;

public class MerOrderSum {
    private String settleNbr;

    private String merNbr;

    private Date clearDate;

    private Date clearTime;

    private BigDecimal totalAmt;

    private Integer totalCount;

    private BigDecimal totalFeeAmt;

    public String getSettleNbr() {
        return settleNbr;
    }

    public void setSettleNbr(String settleNbr) {
        this.settleNbr = settleNbr == null ? null : settleNbr.trim();
    }

    public String getMerNbr() {
        return merNbr;
    }

    public void setMerNbr(String merNbr) {
        this.merNbr = merNbr == null ? null : merNbr.trim();
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

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public BigDecimal getTotalFeeAmt() {
        return totalFeeAmt;
    }

    public void setTotalFeeAmt(BigDecimal totalFeeAmt) {
        this.totalFeeAmt = totalFeeAmt;
    }
}