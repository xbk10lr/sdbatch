package com.sd.batch.mapper.extend;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sd.batch.dto.common.PreCheckOrder;
import com.sd.batch.dto.generate.DownOrder;

public interface DownOrderExtendMapper {

    int insertByBatch(List<DownOrder> list);

    List<PreCheckOrder> selectPreCheckOrder(@Param("channelCode")String channelCode, @Param("checkStatus")String checkStatus);
    
    int updateDownOrderByBatch(List<PreCheckOrder> list);
    
}