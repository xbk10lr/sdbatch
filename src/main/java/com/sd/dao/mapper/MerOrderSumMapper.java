package com.sd.dao.mapper;

import com.sd.dto.generate.MerOrderSum;
import com.sd.dto.generate.MerOrderSumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MerOrderSumMapper {
    int countByExample(MerOrderSumExample example);

    int deleteByExample(MerOrderSumExample example);

    int deleteByPrimaryKey(String settleNbr);

    int insert(MerOrderSum record);

    int insertSelective(MerOrderSum record);

    List<MerOrderSum> selectByExample(MerOrderSumExample example);

    MerOrderSum selectByPrimaryKey(String settleNbr);

    int updateByExampleSelective(@Param("record") MerOrderSum record, @Param("example") MerOrderSumExample example);

    int updateByExample(@Param("record") MerOrderSum record, @Param("example") MerOrderSumExample example);

    int updateByPrimaryKeySelective(MerOrderSum record);

    int updateByPrimaryKey(MerOrderSum record);
}