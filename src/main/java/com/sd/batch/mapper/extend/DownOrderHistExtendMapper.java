package com.sd.batch.mapper.extend;

import org.apache.ibatis.annotations.Param;

public interface DownOrderHistExtendMapper {

    int insertDownOrderHistFromDownOrder(@Param("checkStatus")String checkStatus);
    
}