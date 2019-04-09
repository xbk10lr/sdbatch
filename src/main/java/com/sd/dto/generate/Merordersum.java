package com.sd.dto.generate;

import java.math.BigDecimal;
import java.util.Date;

public class Merordersum {
    private String settlenbr;

    private String mernbr;

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

    public String getMernbr() {
        return mernbr;
    }

    public void setMernbr(String mernbr) {
        this.mernbr = mernbr;
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