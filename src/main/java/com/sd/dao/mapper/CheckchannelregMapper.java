package com.sd.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.sd.dto.generate.Checkchannelreg;
import com.sd.dto.generate.CheckchannelregExample;

@Mapper
public interface CheckchannelregMapper {
    long countByExample(CheckchannelregExample example);

    int deleteByExample(CheckchannelregExample example);

    int deleteByPrimaryKey(String checknbr);

    int insert(Checkchannelreg record);

    int insertSelective(Checkchannelreg record);

    List<Checkchannelreg> selectByExample(CheckchannelregExample example);

    Checkchannelreg selectByPrimaryKey(String checknbr);

    int updateByExampleSelective(@Param("record") Checkchannelreg record, @Param("example") CheckchannelregExample example);

    int updateByExample(@Param("record") Checkchannelreg record, @Param("example") CheckchannelregExample example);

    int updateByPrimaryKeySelective(Checkchannelreg record);

    int updateByPrimaryKey(Checkchannelreg record);
}