package com.sd.batch.mapper.extend;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sd.batch.dto.common.ClearMerOrder;

public interface MerOrderPreCheckExtendMapper {

    int updatePreCheckMerOrderSuccess();
    
    int insertMerOrderPreCheckFromMerOrder(@Param("transDate")Date checkDate);

    List<ClearMerOrder> getMerOrderSum(@Param("transDate")Date checkDate);
    
}