package com.sd.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.sd.dto.generate.Channelordersum;
import com.sd.dto.generate.ChannelordersumExample;

@Mapper
public interface ChannelordersumMapper {
    long countByExample(ChannelordersumExample example);

    int deleteByExample(ChannelordersumExample example);

    int deleteByPrimaryKey(String settlenbr);

    int insert(Channelordersum record);

    int insertSelective(Channelordersum record);

    List<Channelordersum> selectByExample(ChannelordersumExample example);

    Channelordersum selectByPrimaryKey(String settlenbr);

    int updateByExampleSelective(@Param("record") Channelordersum record, @Param("example") ChannelordersumExample example);

    int updateByExample(@Param("record") Channelordersum record, @Param("example") ChannelordersumExample example);

    int updateByPrimaryKeySelective(Channelordersum record);

    int updateByPrimaryKey(Channelordersum record);
}