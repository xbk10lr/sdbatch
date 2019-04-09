package com.sd.dto.generate;

import java.math.BigDecimal;
import java.util.Date;

public class Checkerror {
    private String errornbr;

    private String errortyp;

    private String errordesc;

    private String platseqnbr;

    private String errorstatus;

    private BigDecimal transamt;

    private Date cleardate;

    public String getErrornbr() {
        return errornbr;
    }

    public void setErrornbr(String errornbr) {
        this.errornbr = errornbr;
    }

    public String getErrortyp() {
        return errortyp;
    }

    public void setErrortyp(String errortyp) {
        this.errortyp = errortyp;
    }

    public String getErrordesc() {
        return errordesc;
    }

    public void setErrordesc(String errordesc) {
        this.errordesc = errordesc;
    }

    public String getPlatseqnbr() {
        return platseqnbr;
    }

    public void setPlatseqnbr(String platseqnbr) {
        this.platseqnbr = platseqnbr;
    }

    public String getErrorstatus() {
        return errorstatus;
    }

    public void setErrorstatus(String errorstatus) {
        this.errorstatus = errorstatus;
    }

    public BigDecimal getTransamt() {
        return transamt;
    }

    public void setTransamt(BigDecimal transamt) {
        this.transamt = transamt;
    }

    public Date getCleardate() {
        return cleardate;
    }

    public void setCleardate(Date cleardate) {
        this.cleardate = cleardate;
    }
}