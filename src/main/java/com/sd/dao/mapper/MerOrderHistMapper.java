package com.sd.dao.mapper;

import com.sd.dto.generate.MerOrderHist;
import com.sd.dto.generate.MerOrderHistExample;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MerOrderHistMapper {
    int countByExample(MerOrderHistExample example);

    int deleteByExample(MerOrderHistExample example);

    int deleteByPrimaryKey(@Param("platSeqNbr") String platSeqNbr, @Param("transDate") Date transDate);

    int insert(MerOrderHist record);

    int insertSelective(MerOrderHist record);

    List<MerOrderHist> selectByExample(MerOrderHistExample example);

    MerOrderHist selectByPrimaryKey(@Param("platSeqNbr") String platSeqNbr, @Param("transDate") Date transDate);

    int updateByExampleSelective(@Param("record") MerOrderHist record, @Param("example") MerOrderHistExample example);

    int updateByExample(@Param("record") MerOrderHist record, @Param("example") MerOrderHistExample example);

    int updateByPrimaryKeySelective(MerOrderHist record);

    int updateByPrimaryKey(MerOrderHist record);
}