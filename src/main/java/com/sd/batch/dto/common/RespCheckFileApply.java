package com.sd.batch.dto.common;

/**
 * 申请对账文件 响应类
 * @author Administrator
 *
 */
public class RespCheckFileApply {

	/**
	 * 下游响应状态 0-成功 1-失败 2-超时
	 */
	private String respStatus;
	
	/**
	 * 文件名
	 */
	private String fileName;

	public String getRespStatus() {
		return respStatus;
	}

	public void setRespStatus(String respStatus) {
		this.respStatus = respStatus;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public String toString() {
		return "RespCheckFileApply [respStatus=" + respStatus + ", fileName=" + fileName + "]";
	}
}
