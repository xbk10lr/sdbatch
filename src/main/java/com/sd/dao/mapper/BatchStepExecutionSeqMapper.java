package com.sd.dao.mapper;

import com.sd.dto.generate.BatchStepExecutionSeq;
import com.sd.dto.generate.BatchStepExecutionSeqExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BatchStepExecutionSeqMapper {
    long countByExample(BatchStepExecutionSeqExample example);

    int deleteByExample(BatchStepExecutionSeqExample example);

    int insert(BatchStepExecutionSeq record);

    int insertSelective(BatchStepExecutionSeq record);

    List<BatchStepExecutionSeq> selectByExample(BatchStepExecutionSeqExample example);

    int updateByExampleSelective(@Param("record") BatchStepExecutionSeq record, @Param("example") BatchStepExecutionSeqExample example);

    int updateByExample(@Param("record") BatchStepExecutionSeq record, @Param("example") BatchStepExecutionSeqExample example);
}