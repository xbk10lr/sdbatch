package com.sd.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.sd.dto.generate.Channelorderhist;
import com.sd.dto.generate.ChannelorderhistExample;
import com.sd.dto.generate.ChannelorderhistKey;

@Mapper
public interface ChannelorderhistMapper {
    long countByExample(ChannelorderhistExample example);

    int deleteByExample(ChannelorderhistExample example);

    int deleteByPrimaryKey(ChannelorderhistKey key);

    int insert(Channelorderhist record);

    int insertSelective(Channelorderhist record);

    List<Channelorderhist> selectByExample(ChannelorderhistExample example);

    Channelorderhist selectByPrimaryKey(ChannelorderhistKey key);

    int updateByExampleSelective(@Param("record") Channelorderhist record, @Param("example") ChannelorderhistExample example);

    int updateByExample(@Param("record") Channelorderhist record, @Param("example") ChannelorderhistExample example);

    int updateByPrimaryKeySelective(Channelorderhist record);

    int updateByPrimaryKey(Channelorderhist record);
}