package com.sd.batch.mapper.extend;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sd.batch.dto.common.PreCheckMerOrder;

public interface ChannelMerCheckExtendMapper {

    int insertChannelMerCheckFromPreCheck();
    
    List<PreCheckMerOrder> selectPreCheckMerOrder(@Param("checkStatus")String checkStatus);

}