package com.sd.batch.mapper.extend;

import java.util.List;

import com.sd.batch.dto.generate.DownOrder;

public interface DownOrderExtendMapper {

    int insertByBatch(List<DownOrder> list);

}