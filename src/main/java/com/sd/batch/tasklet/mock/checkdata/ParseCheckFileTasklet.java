package com.sd.batch.tasklet.mock.checkdata;

import java.io.File;
import java.util.Date;
import java.util.List;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sd.batch.base.constants.ChannelCode;
import com.sd.batch.base.constants.CheckFlag;
import com.sd.batch.base.constants.DataDictConst;
import com.sd.batch.base.constants.FileId;
import com.sd.batch.base.constants.JobParameteresKey;
import com.sd.batch.base.constants.SysNbr;
import com.sd.batch.base.utils.DataDictUtils;
import com.sd.batch.base.utils.DateUtil;
import com.sd.batch.base.utils.StringUtil;
import com.sd.batch.base.utils.file.MockFileUtil;
import com.sd.batch.dto.common.ReqCheckFileApply;
import com.sd.batch.dto.common.RespCheckFileApply;
import com.sd.batch.dto.generate.CheckChannelReg;
import com.sd.batch.dto.generate.CheckChannelRegExample;
import com.sd.batch.dto.generate.DownOrder;
import com.sd.batch.mapper.CheckChannelRegMapper;
import com.sd.batch.mapper.SysInfoMapper;
import com.sd.batch.service.CheckFileService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class ParseCheckFileTasklet implements Tasklet{
	
	@Autowired
	private DataDictUtils dataDictUtils;
	
	@Autowired
	private CheckChannelRegMapper checkChannelRegMapper;
	
	@Override
	public RepeatStatus execute(StepContribution arg0, ChunkContext arg1) throws Exception {
		log.info("parse check file tasklet start");
		Date checkDate = (Date) arg1.getStepContext().getJobParameters().get(JobParameteresKey.CHECK_DATE);
		CheckChannelRegExample example = new CheckChannelRegExample();
		example.createCriteria().andChannelCodeEqualTo(ChannelCode.MOCK).andCheckDateEqualTo(checkDate).andCheckFlagEqualTo(CheckFlag.DOWNLOADED);
		List<CheckChannelReg> toParse = checkChannelRegMapper.selectByExample(example);
		String localFilePath = dataDictUtils.getDataDictVal(DataDictConst.LOCAL_FILE_PATH);
		MockFileUtil mockFileUtil = new MockFileUtil();
		for(CheckChannelReg checkChannelReg : toParse){
			String fileName = checkChannelReg.getFileName();
			List<DownOrder> fileParsing = mockFileUtil.fileParsing(new File(localFilePath+fileName), FileId.MOCK_FILE_ID);
			//批量插入
			
			//更新文件状态为已解析
			checkChannelReg.setCheckFlag(CheckFlag.ANALYSED);
			checkChannelRegMapper.updateByPrimaryKeySelective(checkChannelReg);
		}
		
		log.info("parse check file tasklet complete");
		return RepeatStatus.FINISHED;
	}
	
	
}
