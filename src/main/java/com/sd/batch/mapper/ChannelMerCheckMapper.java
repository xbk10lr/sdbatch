package com.sd.batch.mapper;

import com.sd.batch.dto.generate.ChannelMerCheck;
import com.sd.batch.dto.generate.ChannelMerCheckExample;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChannelMerCheckMapper {
    int countByExample(ChannelMerCheckExample example);

    int deleteByExample(ChannelMerCheckExample example);

    int deleteByPrimaryKey(@Param("orderSeqNbr") String orderSeqNbr, @Param("transDate") Date transDate);

    int insert(ChannelMerCheck record);

    int insertSelective(ChannelMerCheck record);

    List<ChannelMerCheck> selectByExample(ChannelMerCheckExample example);

    ChannelMerCheck selectByPrimaryKey(@Param("orderSeqNbr") String orderSeqNbr, @Param("transDate") Date transDate);

    int updateByExampleSelective(@Param("record") ChannelMerCheck record, @Param("example") ChannelMerCheckExample example);

    int updateByExample(@Param("record") ChannelMerCheck record, @Param("example") ChannelMerCheckExample example);

    int updateByPrimaryKeySelective(ChannelMerCheck record);

    int updateByPrimaryKey(ChannelMerCheck record);
}