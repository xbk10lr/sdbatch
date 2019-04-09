package com.sd.dto.generate;

import java.util.Date;

public class MerorderKey {
    private String platseqnbr;

    private Date transdate;

    public String getPlatseqnbr() {
        return platseqnbr;
    }

    public void setPlatseqnbr(String platseqnbr) {
        this.platseqnbr = platseqnbr;
    }

    public Date getTransdate() {
        return transdate;
    }

    public void setTransdate(Date transdate) {
        this.transdate = transdate;
    }
}