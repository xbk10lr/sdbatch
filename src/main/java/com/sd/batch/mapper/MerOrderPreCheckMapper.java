package com.sd.batch.mapper;

import com.sd.batch.dto.generate.MerOrderPreCheck;
import com.sd.batch.dto.generate.MerOrderPreCheckExample;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MerOrderPreCheckMapper {
    int countByExample(MerOrderPreCheckExample example);

    int deleteByExample(MerOrderPreCheckExample example);

    int deleteByPrimaryKey(@Param("platSeqNbr") String platSeqNbr, @Param("transDate") Date transDate);

    int insert(MerOrderPreCheck record);

    int insertSelective(MerOrderPreCheck record);

    List<MerOrderPreCheck> selectByExample(MerOrderPreCheckExample example);

    MerOrderPreCheck selectByPrimaryKey(@Param("platSeqNbr") String platSeqNbr, @Param("transDate") Date transDate);

    int updateByExampleSelective(@Param("record") MerOrderPreCheck record, @Param("example") MerOrderPreCheckExample example);

    int updateByExample(@Param("record") MerOrderPreCheck record, @Param("example") MerOrderPreCheckExample example);

    int updateByPrimaryKeySelective(MerOrderPreCheck record);

    int updateByPrimaryKey(MerOrderPreCheck record);
}