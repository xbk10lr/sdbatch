package com.sd.batch.tasklet.checkdata;

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
import com.sd.batch.base.constants.SysNbr;
import com.sd.batch.base.utils.DataDictUtils;
import com.sd.batch.base.utils.DateUtil;
import com.sd.batch.base.utils.StringUtil;
import com.sd.batch.dto.common.ReqCheckFileApply;
import com.sd.batch.dto.common.RespCheckFileApply;
import com.sd.batch.dto.generate.CheckChannelReg;
import com.sd.batch.mapper.CheckChannelRegMapper;
import com.sd.batch.mapper.SysInfoMapper;
import com.sd.batch.service.CheckFileService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class ApplyCheckFileTasklet implements Tasklet{
	
	@Autowired
	private SysInfoMapper sysInfoMapper;
	
	@Autowired
	private DataDictUtils dataDictUtils;
	
	@Autowired
	private CheckFileService checkFileService;
	
	@Autowired
	private CheckChannelRegMapper checkChannelRegMapper;
	
	@Override
	public RepeatStatus execute(StepContribution arg0, ChunkContext arg1) throws Exception {
		log.info("down check file tasklet start");
		Date checkDate = (Date) arg1.getStepContext().getJobParameters().get(JobParameteresKey.CHECK_DATE);
		ReqCheckFileApply req = new ReqCheckFileApply();
		req.setMernbr(dataDictUtils.getDataDictVal(DataDictConst.MER_NBR));
		req.setCheckDate(DateUtil.parseDateToStr(checkDate, DateUtil.DATE_FORMAT_YYMMDD));
		RespCheckFileApply resp = checkFileService.queryCheckFile(req);
		if("0".equals(resp.getRespStatus()) && !StringUtil.isObjectEmpty(resp.getFileName())){
			CheckChannelReg checkChannelReg = new CheckChannelReg();
			checkChannelReg.setChannelCode(ChannelCode.MOCK);
			checkChannelReg.setCheckDate(checkDate);
			checkChannelReg.setCheckFlag(CheckFlag.APPLIED);
			checkChannelReg.setFileName(resp.getFileName());
			checkChannelRegMapper.updateByPrimaryKeySelective(checkChannelReg);
		} else {
			log.error("下游对账文件申请失败");
			throw new Exception("Apply Check File Fail");
		}
		log.info("down check file tasklet complete");
		return RepeatStatus.FINISHED;
		
		
	}
	
	
}
