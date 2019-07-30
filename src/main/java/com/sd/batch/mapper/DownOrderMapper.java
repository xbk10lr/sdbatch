package com.sd.batch.mapper;

import com.sd.batch.dto.generate.DownOrder;
import com.sd.batch.dto.generate.DownOrderExample;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DownOrderMapper {
    int countByExample(DownOrderExample example);

    int deleteByExample(DownOrderExample example);

    int deleteByPrimaryKey(@Param("orderSeqNbr") String orderSeqNbr, @Param("transDate") Date transDate);

    int insert(DownOrder record);

    int insertSelective(DownOrder record);

    List<DownOrder> selectByExample(DownOrderExample example);

    DownOrder selectByPrimaryKey(@Param("orderSeqNbr") String orderSeqNbr, @Param("transDate") Date transDate);

    int updateByExampleSelective(@Param("record") DownOrder record, @Param("example") DownOrderExample example);

    int updateByExample(@Param("record") DownOrder record, @Param("example") DownOrderExample example);

    int updateByPrimaryKeySelective(DownOrder record);

    int updateByPrimaryKey(DownOrder record);
}