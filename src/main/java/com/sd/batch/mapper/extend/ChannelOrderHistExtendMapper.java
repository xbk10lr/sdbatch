package com.sd.batch.mapper.extend;

import org.apache.ibatis.annotations.Param;

public interface ChannelOrderHistExtendMapper {

    int insertChannelOrderHistFromPreCheck(@Param("checkStatus")String checkStatus);
    
}