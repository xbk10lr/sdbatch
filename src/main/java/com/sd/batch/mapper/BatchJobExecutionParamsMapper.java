package com.sd.batch.mapper;

import com.sd.batch.dto.generate.BatchJobExecutionParams;
import com.sd.batch.dto.generate.BatchJobExecutionParamsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BatchJobExecutionParamsMapper {
    int countByExample(BatchJobExecutionParamsExample example);

    int deleteByExample(BatchJobExecutionParamsExample example);

    int insert(BatchJobExecutionParams record);

    int insertSelective(BatchJobExecutionParams record);

    List<BatchJobExecutionParams> selectByExample(BatchJobExecutionParamsExample example);

    int updateByExampleSelective(@Param("record") BatchJobExecutionParams record, @Param("example") BatchJobExecutionParamsExample example);

    int updateByExample(@Param("record") BatchJobExecutionParams record, @Param("example") BatchJobExecutionParamsExample example);
}