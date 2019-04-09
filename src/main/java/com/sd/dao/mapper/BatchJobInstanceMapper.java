package com.sd.dao.mapper;

import com.sd.dto.generate.BatchJobInstance;
import com.sd.dto.generate.BatchJobInstanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BatchJobInstanceMapper {
    long countByExample(BatchJobInstanceExample example);

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