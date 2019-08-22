package com.sd.batch.mapper.extend;

import java.util.Date;

import org.apache.ibatis.annotations.Param;

public interface MerOrderPreCheckExtendMapper {

    int insertMerOrderHistFromMerOrder(@Param("transDate")Date checkDate);
    
}