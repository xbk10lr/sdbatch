package com.sd.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.sd.dto.generate.Merordersum;
import com.sd.dto.generate.MerordersumExample;

@Mapper
public interface MerordersumMapper {
    long countByExample(MerordersumExample example);

    int deleteByExample(MerordersumExample example);

    int deleteByPrimaryKey(String settlenbr);

    int insert(Merordersum record);

    int insertSelective(Merordersum record);

    List<Merordersum> selectByExample(MerordersumExample example);

    Merordersum selectByPrimaryKey(String settlenbr);

    int updateByExampleSelective(@Param("record") Merordersum record, @Param("example") MerordersumExample example);

    int updateByExample(@Param("record") Merordersum record, @Param("example") MerordersumExample example);

    int updateByPrimaryKeySelective(Merordersum record);

    int updateByPrimaryKey(Merordersum record);
}