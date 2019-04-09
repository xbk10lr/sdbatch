package com.sd.dto.generate;

public class Jobtaskinfo {
    private Integer id;

    private String taskname;

    private String taskexpress;

    private String taskparam;

    private String sysid;

    private String taskstatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTaskname() {
        return taskname;
    }

    public void setTaskname(String taskname) {
        this.taskname = taskname;
    }

    public String getTaskexpress() {
        return taskexpress;
    }

    public void setTaskexpress(String taskexpress) {
        this.taskexpress = taskexpress;
    }

    public String getTaskparam() {
        return taskparam;
    }

    public void setTaskparam(String taskparam) {
        this.taskparam = taskparam;
    }

    public String getSysid() {
        return sysid;
    }

    public void setSysid(String sysid) {
        this.sysid = sysid;
    }

    public String getTaskstatus() {
        return taskstatus;
    }

    public void setTaskstatus(String taskstatus) {
        this.taskstatus = taskstatus;
    }
}