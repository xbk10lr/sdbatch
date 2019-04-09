package com.sd.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.sd.dto.generate.Downorder;
import com.sd.dto.generate.DownorderExample;
import com.sd.dto.generate.DownorderKey;

@Mapper
public interface DownorderMapper {
    long countByExample(DownorderExample example);

    int deleteByExample(DownorderExample example);

    int deleteByPrimaryKey(DownorderKey key);

    int insert(Downorder record);

    int insertSelective(Downorder record);

    List<Downorder> selectByExample(DownorderExample example);

    Downorder selectByPrimaryKey(DownorderKey key);

    int updateByExampleSelective(@Param("record") Downorder record, @Param("example") DownorderExample example);

    int updateByExample(@Param("record") Downorder record, @Param("example") DownorderExample example);

    int updateByPrimaryKeySelective(Downorder record);

    int updateByPrimaryKey(Downorder record);
}