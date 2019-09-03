package com.sd.batch.mapper.extend;

import java.util.Date;

import org.apache.ibatis.annotations.Param;

public interface MerOrderHistExtendMapper {

    int insertMerOrderHistFromMerOrder(@Param("transDate")Date checkDate);
    
}