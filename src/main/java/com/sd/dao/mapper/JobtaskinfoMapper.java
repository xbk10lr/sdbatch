package com.sd.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.sd.dto.generate.Jobtaskinfo;
import com.sd.dto.generate.JobtaskinfoExample;

@Mapper
public interface JobtaskinfoMapper {
    long countByExample(JobtaskinfoExample example);

    int deleteByExample(JobtaskinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Jobtaskinfo record);

    int insertSelective(Jobtaskinfo record);

    List<Jobtaskinfo> selectByExample(JobtaskinfoExample example);

    Jobtaskinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Jobtaskinfo record, @Param("example") JobtaskinfoExample example);

    int updateByExample(@Param("record") Jobtaskinfo record, @Param("example") JobtaskinfoExample example);

    int updateByPrimaryKeySelective(Jobtaskinfo record);

    int updateByPrimaryKey(Jobtaskinfo record);
}