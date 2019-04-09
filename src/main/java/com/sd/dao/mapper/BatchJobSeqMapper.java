package com.sd.dao.mapper;

import com.sd.dto.generate.BatchJobSeq;
import com.sd.dto.generate.BatchJobSeqExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BatchJobSeqMapper {
    long countByExample(BatchJobSeqExample example);

    int deleteByExample(BatchJobSeqExample example);

    int insert(BatchJobSeq record);

    int insertSelective(BatchJobSeq record);

    List<BatchJobSeq> selectByExample(BatchJobSeqExample example);

    int updateByExampleSelective(@Param("record") BatchJobSeq record, @Param("example") BatchJobSeqExample example);

    int updateByExample(@Param("record") BatchJobSeq record, @Param("example") BatchJobSeqExample example);
}