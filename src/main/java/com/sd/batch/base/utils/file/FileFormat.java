package com.sd.batch.base.utils.file;

import java.util.List;

/**
 * 对账文件格式
 * @author
 *
 */
public class FileFormat {

	private String id;
	
	private Boolean skipBeginLine;
	
	private String encoding;
	
	private String lineSeparator;
	
	private Boolean skipEndLine;
	
	private List<String> fields;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Boolean getSkipBeginLine() {
		return skipBeginLine;
	}

	public void setSkipBeginLine(Boolean skipBeginLine) {
		this.skipBeginLine = skipBeginLine;
	}

	public String getEncoding() {
		return encoding;
	}

	public void setEncoding(String encoding) {
		this.encoding = encoding;
	}

	public String getLineSeparator() {
		return lineSeparator;
	}

	public void setLineSeparator(String lineSeparator) {
		this.lineSeparator = lineSeparator;
	}

	public Boolean getSkipEndLine() {
		return skipEndLine;
	}

	public void setSkipEndLine(Boolean skipEndLine) {
		this.skipEndLine = skipEndLine;
	}

	public List<String> getFields() {
		return fields;
	}

	public void setFields(List<String> fields) {
		this.fields = fields;
	}
	
	
}
