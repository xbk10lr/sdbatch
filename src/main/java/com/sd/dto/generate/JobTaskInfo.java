package com.sd.dto.generate;

public class JobTaskInfo {
    private Integer id;

    private String taskName;

    private String taskExpress;

    private String taskParam;

    private String sysId;

    private String taskStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName == null ? null : taskName.trim();
    }

    public String getTaskExpress() {
        return taskExpress;
    }

    public void setTaskExpress(String taskExpress) {
        this.taskExpress = taskExpress == null ? null : taskExpress.trim();
    }

    public String getTaskParam() {
        return taskParam;
    }

    public void setTaskParam(String taskParam) {
        this.taskParam = taskParam == null ? null : taskParam.trim();
    }

    public String getSysId() {
        return sysId;
    }

    public void setSysId(String sysId) {
        this.sysId = sysId == null ? null : sysId.trim();
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus == null ? null : taskStatus.trim();
    }
}