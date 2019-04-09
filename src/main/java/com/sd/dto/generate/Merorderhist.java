package com.sd.dto.generate;

import java.math.BigDecimal;
import java.util.Date;

public class Merorderhist extends MerorderhistKey {
    private String payername;

    private BigDecimal transamt;

    private BigDecimal merfeeamt;

    private String merseqnbr;

    private String merno;

    private Date transtime;

    private Date checkdate;

    private String checkstatus;

    private String orderstatus;

    private Date crtdatetime;

    private Date datelastmaint;

    public String getPayername() {
        return payername;
    }

    public void setPayername(String payername) {
        this.payername = payername;
    }

    public BigDecimal getTransamt() {
        return transamt;
    }

    public void setTransamt(BigDecimal transamt) {
        this.transamt = transamt;
    }

    public BigDecimal getMerfeeamt() {
        return merfeeamt;
    }

    public void setMerfeeamt(BigDecimal merfeeamt) {
        this.merfeeamt = merfeeamt;
    }

    public String getMerseqnbr() {
        return merseqnbr;
    }

    public void setMerseqnbr(String merseqnbr) {
        this.merseqnbr = merseqnbr;
    }

    public String getMerno() {
        return merno;
    }

    public void setMerno(String merno) {
        this.merno = merno;
    }

    public Date getTranstime() {
        return transtime;
    }

    public void setTranstime(Date transtime) {
        this.transtime = transtime;
    }

    public Date getCheckdate() {
        return checkdate;
    }

    public void setCheckdate(Date checkdate) {
        this.checkdate = checkdate;
    }

    public String getCheckstatus() {
        return checkstatus;
    }

    public void setCheckstatus(String checkstatus) {
        this.checkstatus = checkstatus;
    }

    public String getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(String orderstatus) {
        this.orderstatus = orderstatus;
    }

    public Date getCrtdatetime() {
        return crtdatetime;
    }

    public void setCrtdatetime(Date crtdatetime) {
        this.crtdatetime = crtdatetime;
    }

    public Date getDatelastmaint() {
        return datelastmaint;
    }

    public void setDatelastmaint(Date datelastmaint) {
        this.datelastmaint = datelastmaint;
    }
}