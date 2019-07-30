package com.sd.batch.mapper;

import com.sd.batch.dto.generate.CheckChannelReg;
import com.sd.batch.dto.generate.CheckChannelRegExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheckChannelRegMapper {
    int countByExample(CheckChannelRegExample example);

    int deleteByExample(CheckChannelRegExample example);

    int deleteByPrimaryKey(String checkNbr);

    int insert(CheckChannelReg record);

    int insertSelective(CheckChannelReg record);

    List<CheckChannelReg> selectByExample(CheckChannelRegExample example);

    CheckChannelReg selectByPrimaryKey(String checkNbr);

    int updateByExampleSelective(@Param("record") CheckChannelReg record, @Param("example") CheckChannelRegExample example);

    int updateByExample(@Param("record") CheckChannelReg record, @Param("example") CheckChannelRegExample example);

    int updateByPrimaryKeySelective(CheckChannelReg record);

    int updateByPrimaryKey(CheckChannelReg record);
}