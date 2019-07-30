package com.sd.dto.generate;

import java.util.Date;

public class MerCheckFileInfo {
    private String checkNbr;

    private String merNbr;

    private String fileName;

    private String checkFlag;

    private Date checkDate;

    public String getCheckNbr() {
        return checkNbr;
    }

    public void setCheckNbr(String checkNbr) {
        this.checkNbr = checkNbr == null ? null : checkNbr.trim();
    }

    public String getMerNbr() {
        return merNbr;
    }

    public void setMerNbr(String merNbr) {
        this.merNbr = merNbr == null ? null : merNbr.trim();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public String getCheckFlag() {
        return checkFlag;
    }

    public void setCheckFlag(String checkFlag) {
        this.checkFlag = checkFlag == null ? null : checkFlag.trim();
    }

    public Date getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(Date checkDate) {
        this.checkDate = checkDate;
    }
}