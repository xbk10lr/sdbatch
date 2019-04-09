package com.sd.dto.generate;

import java.util.Date;

public class Sysinfo {
    private String sysnbr;

    private Date predate;

    private Date nowdate;

    private Date nextdate;

    public String getSysnbr() {
        return sysnbr;
    }

    public void setSysnbr(String sysnbr) {
        this.sysnbr = sysnbr;
    }

    public Date getPredate() {
        return predate;
    }

    public void setPredate(Date predate) {
        this.predate = predate;
    }

    public Date getNowdate() {
        return nowdate;
    }

    public void setNowdate(Date nowdate) {
        this.nowdate = nowdate;
    }

    public Date getNextdate() {
        return nextdate;
    }

    public void setNextdate(Date nextdate) {
        this.nextdate = nextdate;
    }
}