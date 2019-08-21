package com.sd.batch.mapper.extend;

import java.util.Date;

import org.apache.ibatis.annotations.Param;

public interface ChannelOrderExtendMapper {

    int moveDataToPreCheckSheet(@Param("checkStatus")String checkStatus, @Param("transDate")Date transDate);
    
}