package com.sd.dao.mapper;

import com.sd.dto.generate.ChannelOrderSum;
import com.sd.dto.generate.ChannelOrderSumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChannelOrderSumMapper {
    int countByExample(ChannelOrderSumExample example);

    int deleteByExample(ChannelOrderSumExample example);

    int deleteByPrimaryKey(String settleNbr);

    int insert(ChannelOrderSum record);

    int insertSelective(ChannelOrderSum record);

    List<ChannelOrderSum> selectByExample(ChannelOrderSumExample example);

    ChannelOrderSum selectByPrimaryKey(String settleNbr);

    int updateByExampleSelective(@Param("record") ChannelOrderSum record, @Param("example") ChannelOrderSumExample example);

    int updateByExample(@Param("record") ChannelOrderSum record, @Param("example") ChannelOrderSumExample example);

    int updateByPrimaryKeySelective(ChannelOrderSum record);

    int updateByPrimaryKey(ChannelOrderSum record);
}