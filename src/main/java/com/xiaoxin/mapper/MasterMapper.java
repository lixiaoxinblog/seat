package com.xiaoxin.mapper;

import com.xiaoxin.pojo.Master;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface MasterMapper {

    //根据ID获取主表信息
    public Master getMasterById(int id);

}
