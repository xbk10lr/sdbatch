package com.sd.batch.mapper;

import com.sd.batch.dto.generate.DataDict;
import com.sd.batch.dto.generate.DataDictExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DataDictMapper {
    int countByExample(DataDictExample example);

    int deleteByExample(DataDictExample example);

    int deleteByPrimaryKey(String dataKey);

    int insert(DataDict record);

    int insertSelective(DataDict record);

    List<DataDict> selectByExample(DataDictExample example);

    DataDict selectByPrimaryKey(String dataKey);

    int updateByExampleSelective(@Param("record") DataDict record, @Param("example") DataDictExample example);

    int updateByExample(@Param("record") DataDict record, @Param("example") DataDictExample example);

    int updateByPrimaryKeySelective(DataDict record);

    int updateByPrimaryKey(DataDict record);
}