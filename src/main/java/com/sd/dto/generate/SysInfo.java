package com.sd.dto.generate;

import java.util.Date;

public class SysInfo {
    private String sysNbr;

    private Date preDate;

    private Date nowDate;

    private Date nextDate;

    public String getSysNbr() {
        return sysNbr;
    }

    public void setSysNbr(String sysNbr) {
        this.sysNbr = sysNbr == null ? null : sysNbr.trim();
    }

    public Date getPreDate() {
        return preDate;
    }

    public void setPreDate(Date preDate) {
        this.preDate = preDate;
    }

    public Date getNowDate() {
        return nowDate;
    }

    public void setNowDate(Date nowDate) {
        this.nowDate = nowDate;
    }

    public Date getNextDate() {
        return nextDate;
    }

    public void setNextDate(Date nextDate) {
        this.nextDate = nextDate;
    }
}