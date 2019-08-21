package com.sd.batch.mapper.extend;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sd.batch.dto.common.ClearChannelOrder;
import com.sd.batch.dto.common.PreCheckOrder;

public interface ChannelOrderPreCheckExtendMapper {

    int updateChannelOrderPreCheckByBatch(List<PreCheckOrder> list);
    
    ClearChannelOrder clearChannelOrder(@Param("channelCode")String channelCode, @Param("checkDate")Date checkDate);
}