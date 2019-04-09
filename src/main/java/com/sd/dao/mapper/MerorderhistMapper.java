package com.sd.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.sd.dto.generate.Merorderhist;
import com.sd.dto.generate.MerorderhistExample;
import com.sd.dto.generate.MerorderhistKey;

@Mapper
public interface MerorderhistMapper {
    long countByExample(MerorderhistExample example);

    int deleteByExample(MerorderhistExample example);

    int deleteByPrimaryKey(MerorderhistKey key);

    int insert(Merorderhist record);

    int insertSelective(Merorderhist record);

    List<Merorderhist> selectByExample(MerorderhistExample example);

    Merorderhist selectByPrimaryKey(MerorderhistKey key);

    int updateByExampleSelective(@Param("record") Merorderhist record, @Param("example") MerorderhistExample example);

    int updateByExample(@Param("record") Merorderhist record, @Param("example") MerorderhistExample example);

    int updateByPrimaryKeySelective(Merorderhist record);

    int updateByPrimaryKey(Merorderhist record);
}