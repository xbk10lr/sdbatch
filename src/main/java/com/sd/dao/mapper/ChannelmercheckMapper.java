package com.sd.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.sd.dto.generate.Channelmercheck;
import com.sd.dto.generate.ChannelmercheckExample;
import com.sd.dto.generate.ChannelmercheckKey;

@Mapper
public interface ChannelmercheckMapper {
    long countByExample(ChannelmercheckExample example);

    int deleteByExample(ChannelmercheckExample example);

    int deleteByPrimaryKey(ChannelmercheckKey key);

    int insert(Channelmercheck record);

    int insertSelective(Channelmercheck record);

    List<Channelmercheck> selectByExample(ChannelmercheckExample example);

    Channelmercheck selectByPrimaryKey(ChannelmercheckKey key);

    int updateByExampleSelective(@Param("record") Channelmercheck record, @Param("example") ChannelmercheckExample example);

    int updateByExample(@Param("record") Channelmercheck record, @Param("example") ChannelmercheckExample example);

    int updateByPrimaryKeySelective(Channelmercheck record);

    int updateByPrimaryKey(Channelmercheck record);
}