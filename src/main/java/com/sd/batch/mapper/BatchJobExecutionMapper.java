package com.sd.batch.mapper;

import com.sd.batch.dto.generate.BatchJobExecution;
import com.sd.batch.dto.generate.BatchJobExecutionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BatchJobExecutionMapper {
    int countByExample(BatchJobExecutionExample example);

    int deleteByExample(BatchJobExecutionExample example);

    int deleteByPrimaryKey(Long jobExecutionId);

    int insert(BatchJobExecution record);

    int insertSelective(BatchJobExecution record);

    List<BatchJobExecution> selectByExample(BatchJobExecutionExample example);

    BatchJobExecution selectByPrimaryKey(Long jobExecutionId);

    int updateByExampleSelective(@Param("record") BatchJobExecution record, @Param("example") BatchJobExecutionExample example);

    int updateByExample(@Param("record") BatchJobExecution record, @Param("example") BatchJobExecutionExample example);

    int updateByPrimaryKeySelective(BatchJobExecution record);

    int updateByPrimaryKey(BatchJobExecution record);
}