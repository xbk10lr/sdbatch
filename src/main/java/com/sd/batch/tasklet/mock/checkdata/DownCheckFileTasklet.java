package com.sd.batch.tasklet.mock.checkdata;

import java.util.Date;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sd.batch.base.constants.ChannelCode;
import com.sd.batch.base.constants.CheckFlag;
import com.sd.batch.base.constants.DataDictConst;
import com.sd.batch.base.constants.JobParameteresKey;
import com.sd.batch.base.utils.DataDictUtils;
import com.sd.batch.base.utils.FtpConfig;
import com.sd.batch.base.utils.SftpUtil;
import com.sd.batch.base.utils.StringUtil;
import com.sd.batch.dto.generate.CheckChannelReg;
import com.sd.batch.mapper.CheckChannelRegMapper;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class DownCheckFileTasklet implements Tasklet {

	@Autowired
	private DataDictUtils dataDictUtils;

	@Autowired
	private CheckChannelRegMapper checkChannelRegMapper;

	@Override
	public RepeatStatus execute(StepContribution arg0, ChunkContext arg1) throws Exception {
		log.info("down check file tasklet start");
		Date checkDate = (Date) arg1.getStepContext().getJobParameters().get(JobParameteresKey.CHECK_DATE);
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
				return RepeatStatus.FINISHED;
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
