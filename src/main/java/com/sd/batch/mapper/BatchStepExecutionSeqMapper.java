package com.sd.batch.mapper;

import com.sd.batch.dto.generate.BatchStepExecutionSeq;
import com.sd.batch.dto.generate.BatchStepExecutionSeqExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BatchStepExecutionSeqMapper {
    int countByExample(BatchStepExecutionSeqExample example);

    int deleteByExample(BatchStepExecutionSeqExample example);

    int insert(BatchStepExecutionSeq record);

    int insertSelective(BatchStepExecutionSeq record);

    List<BatchStepExecutionSeq> selectByExample(BatchStepExecutionSeqExample example);

    int updateByExampleSelective(@Param("record") BatchStepExecutionSeq record, @Param("example") BatchStepExecutionSeqExample example);

    int updateByExample(@Param("record") BatchStepExecutionSeq record, @Param("example") BatchStepExecutionSeqExample example);
}