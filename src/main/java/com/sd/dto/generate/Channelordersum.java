package com.sd.dto.generate;

import java.math.BigDecimal;
import java.util.Date;

public class Channelordersum {
    private String settlenbr;

    private String channelcode;

    private Date cleardate;

    private Date cleartime;

    private BigDecimal totalamt;

    private Integer totalcount;

    private BigDecimal totalfeeamt;

    public String getSettlenbr() {
        return settlenbr;
    }

    public void setSettlenbr(String settlenbr) {
        this.settlenbr = settlenbr;
    }

    public String getChannelcode() {
        return channelcode;
    }

    public void setChannelcode(String channelcode) {
        this.channelcode = channelcode;
    }

    public Date getCleardate() {
        return cleardate;
    }

    public void setCleardate(Date cleardate) {
        this.cleardate = cleardate;
    }

    public Date getCleartime() {
        return cleartime;
    }

    public void setCleartime(Date cleartime) {
        this.cleartime = cleartime;
    }

    public BigDecimal getTotalamt() {
        return totalamt;
    }

    public void setTotalamt(BigDecimal totalamt) {
        this.totalamt = totalamt;
    }

    public Integer getTotalcount() {
        return totalcount;
    }

    public void setTotalcount(Integer totalcount) {
        this.totalcount = totalcount;
    }

    public BigDecimal getTotalfeeamt() {
        return totalfeeamt;
    }

    public void setTotalfeeamt(BigDecimal totalfeeamt) {
        this.totalfeeamt = totalfeeamt;
    }
}