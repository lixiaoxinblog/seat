package com.xiaoxin.service.impl;

import com.xiaoxin.mapper.MasterMapper;
import com.xiaoxin.pojo.Master;
import com.xiaoxin.service.MasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class MasterServiceImpl implements MasterService {

    @Autowired
    MasterMapper masterMapper;

    @Override
    public Master getMasterById(Integer id) {
        return masterMapper.getMasterById(id);
    }
}
