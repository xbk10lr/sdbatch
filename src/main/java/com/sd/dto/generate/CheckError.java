package com.sd.dto.generate;

import java.math.BigDecimal;
import java.util.Date;

public class CheckError {
    private String errorNbr;

    private String errorTyp;

    private String errorDesc;

    private String platSeqNbr;

    private String errorStatus;

    private BigDecimal transAmt;

    private Date clearDate;

    public String getErrorNbr() {
        return errorNbr;
    }

    public void setErrorNbr(String errorNbr) {
        this.errorNbr = errorNbr == null ? null : errorNbr.trim();
    }

    public String getErrorTyp() {
        return errorTyp;
    }

    public void setErrorTyp(String errorTyp) {
        this.errorTyp = errorTyp == null ? null : errorTyp.trim();
    }

    public String getErrorDesc() {
        return errorDesc;
    }

    public void setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc == null ? null : errorDesc.trim();
    }

    public String getPlatSeqNbr() {
        return platSeqNbr;
    }

    public void setPlatSeqNbr(String platSeqNbr) {
        this.platSeqNbr = platSeqNbr == null ? null : platSeqNbr.trim();
    }

    public String getErrorStatus() {
        return errorStatus;
    }

    public void setErrorStatus(String errorStatus) {
        this.errorStatus = errorStatus == null ? null : errorStatus.trim();
    }

    public BigDecimal getTransAmt() {
        return transAmt;
    }

    public void setTransAmt(BigDecimal transAmt) {
        this.transAmt = transAmt;
    }

    public Date getClearDate() {
        return clearDate;
    }

    public void setClearDate(Date clearDate) {
        this.clearDate = clearDate;
    }
}