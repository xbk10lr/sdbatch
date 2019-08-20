package com.sd.batch.mapper;

import com.sd.batch.dto.generate.DownOrderHist;
import com.sd.batch.dto.generate.DownOrderHistExample;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DownOrderHistMapper {
    int countByExample(DownOrderHistExample example);

    int deleteByExample(DownOrderHistExample example);

    int deleteByPrimaryKey(@Param("orderSeqNbr") String orderSeqNbr, @Param("transDate") Date transDate);

    int insert(DownOrderHist record);

    int insertSelective(DownOrderHist record);

    List<DownOrderHist> selectByExample(DownOrderHistExample example);

    DownOrderHist selectByPrimaryKey(@Param("orderSeqNbr") String orderSeqNbr, @Param("transDate") Date transDate);

    int updateByExampleSelective(@Param("record") DownOrderHist record, @Param("example") DownOrderHistExample example);

    int updateByExample(@Param("record") DownOrderHist record, @Param("example") DownOrderHistExample example);

    int updateByPrimaryKeySelective(DownOrderHist record);

    int updateByPrimaryKey(DownOrderHist record);
}