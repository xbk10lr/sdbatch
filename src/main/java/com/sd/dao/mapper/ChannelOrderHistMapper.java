package com.sd.dao.mapper;

import com.sd.dto.generate.ChannelOrderHist;
import com.sd.dto.generate.ChannelOrderHistExample;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChannelOrderHistMapper {
    int countByExample(ChannelOrderHistExample example);

    int deleteByExample(ChannelOrderHistExample example);

    int deleteByPrimaryKey(@Param("orderSeqNbr") String orderSeqNbr, @Param("transDate") Date transDate);

    int insert(ChannelOrderHist record);

    int insertSelective(ChannelOrderHist record);

    List<ChannelOrderHist> selectByExample(ChannelOrderHistExample example);

    ChannelOrderHist selectByPrimaryKey(@Param("orderSeqNbr") String orderSeqNbr, @Param("transDate") Date transDate);

    int updateByExampleSelective(@Param("record") ChannelOrderHist record, @Param("example") ChannelOrderHistExample example);

    int updateByExample(@Param("record") ChannelOrderHist record, @Param("example") ChannelOrderHistExample example);

    int updateByPrimaryKeySelective(ChannelOrderHist record);

    int updateByPrimaryKey(ChannelOrderHist record);
}