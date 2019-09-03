package com.sd.batch.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sd.batch.base.constants.CheckStatus;
import com.sd.batch.base.constants.OrderStatus;
import com.sd.batch.dto.generate.MerOrderExample;
import com.sd.batch.dto.generate.MerOrderPreCheck;
import com.sd.batch.dto.generate.MerOrderPreCheckExample;
import com.sd.batch.mapper.MerOrderMapper;
import com.sd.batch.mapper.MerOrderPreCheckMapper;
import com.sd.batch.mapper.extend.MerOrderHistExtendMapper;
import com.sd.batch.mapper.extend.MerOrderPreCheckExtendMapper;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CheckMerOrderServiceImpl implements CheckMerOrderService {

	@Autowired
	private MerOrderHistExtendMapper merOrderHistExtendMapper;
	
	@Autowired
	private MerOrderMapper merOrderMapper;
	
	@Autowired
	private MerOrderPreCheckMapper merOrderPreCheckMapper;
	
	@Autowired
	private MerOrderPreCheckExtendMapper merOrderPreCheckExtendMapper;
	
	
	@Override
	@Transactional
	public void merOrderPreCheck(Date checkDate) {
		log.info("merOrderPreCheck start checkDate :"+checkDate);
		//把当前对账日期商户订单表中的数据转移到历史表中
		merOrderHistExtendMapper.insertMerOrderHistFromMerOrder(checkDate);
		//删除当前表中对账日期以及对账日期之前的订单记录
		MerOrderExample merOrderExample = new MerOrderExample();
		merOrderExample.createCriteria().andTransDateLessThanOrEqualTo(checkDate);
		merOrderMapper.deleteByExample(merOrderExample);
		//把商户订单待对账表中当前对账日期以及之前的对账状态为初始订单的对账状态更新为待对账
		MerOrderPreCheckExample merOrderPreCheckExample = new MerOrderPreCheckExample();
		merOrderPreCheckExample.createCriteria().andTransDateLessThanOrEqualTo(checkDate).andCheckStatusEqualTo(CheckStatus.INIT);
		MerOrderPreCheck merOrderPreCheck = new MerOrderPreCheck();
		merOrderPreCheck.setCheckStatus(CheckStatus.PRECHECK);
		merOrderPreCheckMapper.updateByExampleSelective(merOrderPreCheck, merOrderPreCheckExample);
		log.info("merOrderPreCheck end");
	}

	@Transactional
	@Override
	public void merOrderCheck() {
		//先更新商户订单中交易成功的
		merOrderPreCheckExtendMapper.updatePreCheckMerOrderSuccess();
		MerOrderPreCheckExample example = new MerOrderPreCheckExample();
		//其余的更新为交易失败
		example.createCriteria().andCheckStatusEqualTo(CheckStatus.PRECHECK);
		MerOrderPreCheck record = new MerOrderPreCheck();
		record.setCheckStatus(CheckStatus.CHECKED);
		record.setOrderStatus(OrderStatus.FAIL);
		merOrderPreCheckMapper.updateByExampleSelective(record, example);
	}

}
