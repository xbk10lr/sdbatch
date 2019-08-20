package com.sd.batch.service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sd.batch.base.constants.ChannelCode;
import com.sd.batch.base.constants.CheckFlag;
import com.sd.batch.base.constants.DataDictConst;
import com.sd.batch.base.http.HttpClient;
import com.sd.batch.base.http.HttpConfig;
import com.sd.batch.base.utils.DataDictUtils;
import com.sd.batch.base.utils.DateUtil;
import com.sd.batch.base.utils.FtpConfig;
import com.sd.batch.base.utils.SftpUtil;
import com.sd.batch.base.utils.StringUtil;
import com.sd.batch.dto.common.ReqCheckFileApply;
import com.sd.batch.dto.common.RespCheckFileApply;
import com.sd.batch.dto.generate.CheckChannelReg;
import com.sd.batch.mapper.CheckChannelRegMapper;

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
	
	@Autowired
	private CheckChannelRegMapper checkChannelRegMapper;

	@Override
	public RespCheckFileApply queryCheckFile(Date checkDate) {
		ReqCheckFileApply req = new ReqCheckFileApply();
		req.setMernbr(dataDictUtils.getDataDictVal(DataDictConst.MER_NBR));
		req.setCheckDate(DateUtil.parseDateToStr(checkDate, DateUtil.DATE_FORMAT_YYMMDD));
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

	@Override
	public void deleteDuplicatedCheckChannelReg(String channelCode, Date checkDate) {
		checkChannelRegMapper.deleteByPrimaryKey(ChannelCode.MOCK, checkDate);
	}

	@Override
	public void insertCheckChannelReg(String channelCode, Date checkDate) {
		CheckChannelReg checkChannelReg = new CheckChannelReg();
		checkChannelReg.setChannelCode(ChannelCode.MOCK);
		checkChannelReg.setCheckDate(checkDate);
		checkChannelReg.setCheckFlag(CheckFlag.INIT);
		checkChannelReg.setCheckNbr(DateUtil.parseDateToStr(new Date(), DateUtil.DATE_FORMAT_YYYYMMDDHHmm));
		checkChannelRegMapper.insertSelective(checkChannelReg);
	}

	@Override
	public void updateCheckChannelRegApplied(RespCheckFileApply resp, Date checkDate) throws Exception {
		if("0".equals(resp.getRespStatus()) && !StringUtil.isObjectEmpty(resp.getFileName())){
			CheckChannelReg checkChannelReg = new CheckChannelReg();
			checkChannelReg.setChannelCode(ChannelCode.MOCK);
			checkChannelReg.setCheckDate(checkDate);
			checkChannelReg.setCheckFlag(CheckFlag.APPLIED);
			checkChannelReg.setFileName(resp.getFileName());
			checkChannelRegMapper.updateByPrimaryKeySelective(checkChannelReg);
		} else {
			log.error("Apply Check File Fail!");
			throw new Exception("Apply Check File Fail");
		}
		
	}

	@Override
	public void downCheckFile(String channelCode, Date checkDate) throws Exception {
		CheckChannelReg checkChannelReg = checkChannelRegMapper.selectByPrimaryKey(ChannelCode.MOCK, checkDate);
		if (CheckFlag.APPLIED.equals(checkChannelReg.getCheckFlag())
				&& !StringUtil.isObjectEmpty(checkChannelReg.getFileName())) {
			FtpConfig config = new FtpConfig();
			config.setMode("sftp");
			config.setHost(dataDictUtils.getDataDictVal(DataDictConst.SFTP_IP));
			config.setPort(StringUtil.getIntegerFromString(dataDictUtils.getDataDictVal(DataDictConst.SFTP_PORT)));
			config.setUserName(dataDictUtils.getDataDictVal(DataDictConst.SFTP_USER_NAME));
			config.setPassword(dataDictUtils.getDataDictVal(DataDictConst.SFTP_PASSWORD));
			config.setWorkingDirectory(dataDictUtils.getDataDictVal(DataDictConst.SFTP_DIRECTORY));
			/**
			 * 下载对账文件
			 */
			if (SftpUtil.downloadFile(checkChannelReg.getFileName(),
					dataDictUtils.getDataDictVal(DataDictConst.LOCAL_FILE_PATH), checkDate, config)) {
				log.info("对账文件下载成功");
				checkChannelReg.setCheckFlag(CheckFlag.DOWNLOADED);
				checkChannelRegMapper.updateByPrimaryKeySelective(checkChannelReg);
				return;
			} else {
				log.error("对账文件下载失败");
				throw new Exception("Down Check File Fail");
			}
		} else {
			log.error("对账文件下载失败,对账文件申请异常");
			throw new Exception("Down Check File Fail, Cause Apply File Exception");
		}
	}
	
	
	
}
