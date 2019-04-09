package com.sd.dto.generate;

import java.math.BigDecimal;
import java.util.Date;

public class Channelorderhist extends ChannelorderhistKey {
    private String payername;

    private BigDecimal transamt;

    private BigDecimal channelfeeamt;

    private String channelcode;

    private String platseqnbr;

    private String downseqnbr;

    private String returncode;

    private String returnmsg;

    private String merno;

    private Date transtime;

    private Date checkdate;

    private String checkstatus;

    private String orderstatus;

    private String respmsg;

    private String respcode;

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

    public BigDecimal getChannelfeeamt() {
        return channelfeeamt;
    }

    public void setChannelfeeamt(BigDecimal channelfeeamt) {
        this.channelfeeamt = channelfeeamt;
    }

    public String getChannelcode() {
        return channelcode;
    }

    public void setChannelcode(String channelcode) {
        this.channelcode = channelcode;
    }

    public String getPlatseqnbr() {
        return platseqnbr;
    }

    public void setPlatseqnbr(String platseqnbr) {
        this.platseqnbr = platseqnbr;
    }

    public String getDownseqnbr() {
        return downseqnbr;
    }

    public void setDownseqnbr(String downseqnbr) {
        this.downseqnbr = downseqnbr;
    }

    public String getReturncode() {
        return returncode;
    }

    public void setReturncode(String returncode) {
        this.returncode = returncode;
    }

    public String getReturnmsg() {
        return returnmsg;
    }

    public void setReturnmsg(String returnmsg) {
        this.returnmsg = returnmsg;
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

    public String getRespmsg() {
        return respmsg;
    }

    public void setRespmsg(String respmsg) {
        this.respmsg = respmsg;
    }

    public String getRespcode() {
        return respcode;
    }

    public void setRespcode(String respcode) {
        this.respcode = respcode;
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