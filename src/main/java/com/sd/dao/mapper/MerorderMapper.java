package com.sd.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.sd.dto.generate.Merorder;
import com.sd.dto.generate.MerorderExample;
import com.sd.dto.generate.MerorderKey;

@Mapper
public interface MerorderMapper {
    long countByExample(MerorderExample example);

    int deleteByExample(MerorderExample example);

    int deleteByPrimaryKey(MerorderKey key);

    int insert(Merorder record);

    int insertSelective(Merorder record);

    List<Merorder> selectByExample(MerorderExample example);

    Merorder selectByPrimaryKey(MerorderKey key);

    int updateByExampleSelective(@Param("record") Merorder record, @Param("example") MerorderExample example);

    int updateByExample(@Param("record") Merorder record, @Param("example") MerorderExample example);

    int updateByPrimaryKeySelective(Merorder record);

    int updateByPrimaryKey(Merorder record);
}