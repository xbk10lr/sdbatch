package com.sd.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.sd.dto.generate.Channelorder;
import com.sd.dto.generate.ChannelorderExample;
import com.sd.dto.generate.ChannelorderKey;

@Mapper
public interface ChannelorderMapper {
    long countByExample(ChannelorderExample example);

    int deleteByExample(ChannelorderExample example);

    int deleteByPrimaryKey(ChannelorderKey key);

    int insert(Channelorder record);

    int insertSelective(Channelorder record);

    List<Channelorder> selectByExample(ChannelorderExample example);

    Channelorder selectByPrimaryKey(ChannelorderKey key);

    int updateByExampleSelective(@Param("record") Channelorder record, @Param("example") ChannelorderExample example);

    int updateByExample(@Param("record") Channelorder record, @Param("example") ChannelorderExample example);

    int updateByPrimaryKeySelective(Channelorder record);

    int updateByPrimaryKey(Channelorder record);
}