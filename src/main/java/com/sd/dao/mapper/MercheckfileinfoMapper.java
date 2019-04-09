package com.sd.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.sd.dto.generate.Mercheckfileinfo;
import com.sd.dto.generate.MercheckfileinfoExample;

@Mapper
public interface MercheckfileinfoMapper {
    long countByExample(MercheckfileinfoExample example);

    int deleteByExample(MercheckfileinfoExample example);

    int deleteByPrimaryKey(String checknbr);

    int insert(Mercheckfileinfo record);

    int insertSelective(Mercheckfileinfo record);

    List<Mercheckfileinfo> selectByExample(MercheckfileinfoExample example);

    Mercheckfileinfo selectByPrimaryKey(String checknbr);

    int updateByExampleSelective(@Param("record") Mercheckfileinfo record, @Param("example") MercheckfileinfoExample example);

    int updateByExample(@Param("record") Mercheckfileinfo record, @Param("example") MercheckfileinfoExample example);

    int updateByPrimaryKeySelective(Mercheckfileinfo record);

    int updateByPrimaryKey(Mercheckfileinfo record);
}