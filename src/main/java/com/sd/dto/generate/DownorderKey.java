package com.sd.dto.generate;

import java.util.Date;

public class DownorderKey {
    private String orderseqnbr;

    private Date transdate;

    public String getOrderseqnbr() {
        return orderseqnbr;
    }

    public void setOrderseqnbr(String orderseqnbr) {
        this.orderseqnbr = orderseqnbr;
    }

    public Date getTransdate() {
        return transdate;
    }

    public void setTransdate(Date transdate) {
        this.transdate = transdate;
    }
}