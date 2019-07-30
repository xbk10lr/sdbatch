package com.sd.batch.mapper;

import com.sd.batch.dto.generate.MerOrder;
import com.sd.batch.dto.generate.MerOrderExample;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MerOrderMapper {
    int countByExample(MerOrderExample example);

    int deleteByExample(MerOrderExample example);

    int deleteByPrimaryKey(@Param("platSeqNbr") String platSeqNbr, @Param("transDate") Date transDate);

    int insert(MerOrder record);

    int insertSelective(MerOrder record);

    List<MerOrder> selectByExample(MerOrderExample example);

    MerOrder selectByPrimaryKey(@Param("platSeqNbr") String platSeqNbr, @Param("transDate") Date transDate);

    int updateByExampleSelective(@Param("record") MerOrder record, @Param("example") MerOrderExample example);

    int updateByExample(@Param("record") MerOrder record, @Param("example") MerOrderExample example);

    int updateByPrimaryKeySelective(MerOrder record);

    int updateByPrimaryKey(MerOrder record);
}