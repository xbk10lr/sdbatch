package com.sd.dto.generate;

import java.util.Date;

public class Checkchannelreg {
    private String checknbr;

    private String channelcode;

    private String filename;

    private String checkflag;

    private Date checkdate;

    public String getChecknbr() {
        return checknbr;
    }

    public void setChecknbr(String checknbr) {
        this.checknbr = checknbr;
    }

    public String getChannelcode() {
        return channelcode;
    }

    public void setChannelcode(String channelcode) {
        this.channelcode = channelcode;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getCheckflag() {
        return checkflag;
    }

    public void setCheckflag(String checkflag) {
        this.checkflag = checkflag;
    }

    public Date getCheckdate() {
        return checkdate;
    }

    public void setCheckdate(Date checkdate) {
        this.checkdate = checkdate;
    }
}