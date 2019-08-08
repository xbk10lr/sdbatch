package com.sd.batch.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sd.batch.base.constants.DataDictConst;
import com.sd.batch.base.http.HttpClient;
import com.sd.batch.base.http.HttpConfig;
import com.sd.batch.base.utils.DataDictUtils;
import com.sd.batch.base.utils.StringUtil;
import com.sd.batch.dto.common.ReqCheckFileApply;
import com.sd.batch.dto.common.RespCheckFileApply;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CheckFileServiceImpl implements CheckFileService{
	
	private static final String MER_NBR="merNbr";
	
	private static final String CHECK_DATE="checkDate";
	
	private static final String RESP_STATUS="respStatus";
	
	private static final String FILE_NAME="fileName";
	
	@Autowired
	private DataDictUtils dataDictUtils;

	@Override
	public RespCheckFileApply queryCheckFile(ReqCheckFileApply req) {
		log.info("req:"+req.toString());
		Map<String,String> map = new HashMap<String,String>();
		map.put(MER_NBR, req.getMernbr());
		map.put(CHECK_DATE, req.getCheckDate());
		HttpClient client = new HttpClient();
		HttpConfig httpConfig = new HttpConfig();
		httpConfig.setConnectionTimeOut(30000);
		httpConfig.setReadTimeOut(30000);
		httpConfig.setEncoding("UTF-8");
		httpConfig.setRequestUrl(dataDictUtils.getDataDictVal(DataDictConst.HTTP_URL));
		RespCheckFileApply resp = new RespCheckFileApply();
		try {
			String res = client.send(map, httpConfig);
			Map<String, String> resMap = StringUtil.convertResultStringToMap(res);
			resp.setRespStatus(resMap.get(RESP_STATUS));
			resp.setFileName(resMap.get(FILE_NAME));
			return resp;
		} catch (Exception e) {
			resp.setRespStatus("2");
			return resp;
		}
		
	}
	
	
	
}
