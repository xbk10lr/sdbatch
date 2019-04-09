package com.sd.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.sd.dto.generate.Checkerror;
import com.sd.dto.generate.CheckerrorExample;

@Mapper
public interface CheckerrorMapper {
    long countByExample(CheckerrorExample example);

    int deleteByExample(CheckerrorExample example);

    int deleteByPrimaryKey(String errornbr);

    int insert(Checkerror record);

    int insertSelective(Checkerror record);

    List<Checkerror> selectByExample(CheckerrorExample example);

    Checkerror selectByPrimaryKey(String errornbr);

    int updateByExampleSelective(@Param("record") Checkerror record, @Param("example") CheckerrorExample example);

    int updateByExample(@Param("record") Checkerror record, @Param("example") CheckerrorExample example);

    int updateByPrimaryKeySelective(Checkerror record);

    int updateByPrimaryKey(Checkerror record);
}