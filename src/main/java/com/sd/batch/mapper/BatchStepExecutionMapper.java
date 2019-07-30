package com.sd.batch.mapper;

import com.sd.batch.dto.generate.BatchStepExecution;
import com.sd.batch.dto.generate.BatchStepExecutionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BatchStepExecutionMapper {
    int countByExample(BatchStepExecutionExample example);

    int deleteByExample(BatchStepExecutionExample example);

    int deleteByPrimaryKey(Long stepExecutionId);

    int insert(BatchStepExecution record);

    int insertSelective(BatchStepExecution record);

    List<BatchStepExecution> selectByExample(BatchStepExecutionExample example);

    BatchStepExecution selectByPrimaryKey(Long stepExecutionId);

    int updateByExampleSelective(@Param("record") BatchStepExecution record, @Param("example") BatchStepExecutionExample example);

    int updateByExample(@Param("record") BatchStepExecution record, @Param("example") BatchStepExecutionExample example);

    int updateByPrimaryKeySelective(BatchStepExecution record);

    int updateByPrimaryKey(BatchStepExecution record);
}