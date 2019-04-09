package com.sd.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.sd.dto.generate.Sysinfo;
import com.sd.dto.generate.SysinfoExample;

@Mapper
public interface SysinfoMapper {
    long countByExample(SysinfoExample example);

    int deleteByExample(SysinfoExample example);

    int deleteByPrimaryKey(String sysnbr);

    int insert(Sysinfo record);

    int insertSelective(Sysinfo record);

    List<Sysinfo> selectByExample(SysinfoExample example);

    Sysinfo selectByPrimaryKey(String sysnbr);

    int updateByExampleSelective(@Param("record") Sysinfo record, @Param("example") SysinfoExample example);

    int updateByExample(@Param("record") Sysinfo record, @Param("example") SysinfoExample example);

    int updateByPrimaryKeySelective(Sysinfo record);

    int updateByPrimaryKey(Sysinfo record);
}