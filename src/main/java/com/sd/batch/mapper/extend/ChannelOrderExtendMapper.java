package com.sd.batch.mapper.extend;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sd.batch.dto.common.PreCheckOrder;

public interface ChannelOrderExtendMapper {

    int moveDataToPreCheckSheet(@Param("checkStatus")String checkStatus, @Param("transDate")Date transDate);
    
    List<PreCheckOrder> selectPreCheckOrder(@Param("channelCode")String channelCode, @Param("checkStatus")String checkStatus);

}