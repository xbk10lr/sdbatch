package com.sd.batch.mapper;

import com.sd.batch.dto.generate.BatchJobInstance;
import com.sd.batch.dto.generate.BatchJobInstanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BatchJobInstanceMapper {
    int countByExample(BatchJobInstanceExample example);

    int deleteByExample(BatchJobInstanceExample example);

    int deleteByPrimaryKey(Long jobInstanceId);

    int insert(BatchJobInstance record);

    int insertSelective(BatchJobInstance record);

    List<BatchJobInstance> selectByExample(BatchJobInstanceExample example);

    BatchJobInstance selectByPrimaryKey(Long jobInstanceId);

    int updateByExampleSelective(@Param("record") BatchJobInstance record, @Param("example") BatchJobInstanceExample example);

    int updateByExample(@Param("record") BatchJobInstance record, @Param("example") BatchJobInstanceExample example);

    int updateByPrimaryKeySelective(BatchJobInstance record);

    int updateByPrimaryKey(BatchJobInstance record);
}