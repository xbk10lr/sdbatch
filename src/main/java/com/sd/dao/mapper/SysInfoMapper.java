package com.sd.dao.mapper;

import com.sd.dto.generate.SysInfo;
import com.sd.dto.generate.SysInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysInfoMapper {
    int countByExample(SysInfoExample example);

    int deleteByExample(SysInfoExample example);

    int deleteByPrimaryKey(String sysNbr);

    int insert(SysInfo record);

    int insertSelective(SysInfo record);

    List<SysInfo> selectByExample(SysInfoExample example);

    SysInfo selectByPrimaryKey(String sysNbr);

    int updateByExampleSelective(@Param("record") SysInfo record, @Param("example") SysInfoExample example);

    int updateByExample(@Param("record") SysInfo record, @Param("example") SysInfoExample example);

    int updateByPrimaryKeySelective(SysInfo record);

    int updateByPrimaryKey(SysInfo record);
}