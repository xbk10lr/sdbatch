package com.sd.dao.mapper;

import com.sd.dto.generate.BatchJobExecutionSeq;
import com.sd.dto.generate.BatchJobExecutionSeqExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BatchJobExecutionSeqMapper {
    long countByExample(BatchJobExecutionSeqExample example);

    int deleteByExample(BatchJobExecutionSeqExample example);

    int insert(BatchJobExecutionSeq record);

    int insertSelective(BatchJobExecutionSeq record);

    List<BatchJobExecutionSeq> selectByExample(BatchJobExecutionSeqExample example);

    int updateByExampleSelective(@Param("record") BatchJobExecutionSeq record, @Param("example") BatchJobExecutionSeqExample example);

    int updateByExample(@Param("record") BatchJobExecutionSeq record, @Param("example") BatchJobExecutionSeqExample example);
}