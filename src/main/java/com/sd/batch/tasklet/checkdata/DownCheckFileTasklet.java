package com.sd.batch.tasklet.checkdata;

import java.util.Date;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sd.batch.base.constants.DataDictConst;
import com.sd.batch.base.constants.SysNbr;
import com.sd.batch.base.utils.DataDictUtils;
import com.sd.batch.base.utils.DateUtil;
import com.sd.batch.base.utils.FtpConfig;
import com.sd.batch.base.utils.SftpUtil;
import com.sd.batch.base.utils.StringUtil;
import com.sd.batch.dto.common.ReqCheckFileApply;
import com.sd.batch.dto.common.RespCheckFileApply;
import com.sd.batch.mapper.SysInfoMapper;
import com.sd.batch.service.CheckFileService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class DownCheckFileTasklet implements Tasklet{
	
	@Autowired
	private SysInfoMapper sysInfoMapper;
	
	@Autowired
	private DataDictUtils dataDictUtils;
	
	@Autowired
	private CheckFileService checkFileService;
	
	@Override
	public RepeatStatus execute(StepContribution arg0, ChunkContext arg1) throws Exception {
		log.info("down check file tasklet start");
		Date checkDate = sysInfoMapper.selectByPrimaryKey(SysNbr.BATCH_NAME).getPreDate();
		ReqCheckFileApply req = new ReqCheckFileApply();
		req.setMernbr(dataDictUtils.getDataDictVal(DataDictConst.MER_NBR));
		req.setCheckDate(DateUtil.parseDateToStr(checkDate, DateUtil.DATE_FORMAT_YYMMDD));
		RespCheckFileApply resp = checkFileService.queryCheckFile(req);
		if("0".equals(resp.getRespStatus()) && !StringUtil.isObjectEmpty(resp.getFileName())){
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
			if(SftpUtil.downloadFile(resp.getFileName(), dataDictUtils.getDataDictVal(DataDictConst.LOCAL_FILE_PATH), checkDate, config)){
				log.info("对账文件下载成功");
				return RepeatStatus.FINISHED;
			} else {
				log.error("对账文件下载失败");
				throw new Exception("对账文件下载失败");
			}
		} else {
			log.error("下游对账文件申请失败");
			throw new Exception("下游对账文件申请失败");
		}
		
		
	}
	
	
}
