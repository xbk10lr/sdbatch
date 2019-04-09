package com.sd.dao.mapper;

import com.sd.dto.generate.BatchJobExecutionContext;
import com.sd.dto.generate.BatchJobExecutionContextExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BatchJobExecutionContextMapper {
    long countByExample(BatchJobExecutionContextExample example);

    int deleteByExample(BatchJobExecutionContextExample example);

    int deleteByPrimaryKey(Long jobExecutionId);

    int insert(BatchJobExecutionContext record);

    int insertSelective(BatchJobExecutionContext record);

    List<BatchJobExecutionContext> selectByExampleWithBLOBs(BatchJobExecutionContextExample example);

    List<BatchJobExecutionContext> selectByExample(BatchJobExecutionContextExample example);

    BatchJobExecutionContext selectByPrimaryKey(Long jobExecutionId);

    int updateByExampleSelective(@Param("record") BatchJobExecutionContext record, @Param("example") BatchJobExecutionContextExample example);

    int updateByExampleWithBLOBs(@Param("record") BatchJobExecutionContext record, @Param("example") BatchJobExecutionContextExample example);

    int updateByExample(@Param("record") BatchJobExecutionContext record, @Param("example") BatchJobExecutionContextExample example);

    int updateByPrimaryKeySelective(BatchJobExecutionContext record);

    int updateByPrimaryKeyWithBLOBs(BatchJobExecutionContext record);

    int updateByPrimaryKey(BatchJobExecutionContext record);
}