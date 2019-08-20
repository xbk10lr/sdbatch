package com.sd.batch.base.utils;

import java.util.Date;

public class IdSeqFactory {
	
	/**
	 * 根据时间戳生产流水号yyyyMMddHHmmssSSS
	 * @return
	 */
	public static String getIdSeqByTimestamp(){
		return DateUtil.parseDateToStr(new Date(), DateUtil.DATE_TIME_FORMAT_YYYYMMDDHHMISSSSS);
	}
	
	public static String getIdSeqByTimestamp(String suffix){
		return getIdSeqByTimestamp()+suffix;
	}
}
