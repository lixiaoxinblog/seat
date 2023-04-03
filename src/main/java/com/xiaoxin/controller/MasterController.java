package com.xiaoxin.controller;

import com.xiaoxin.pojo.Master;
import com.xiaoxin.service.MasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/master")
public class MasterController {

    @Autowired
    MasterService masterService;
    @GetMapping("/get/{id}")
    public Master getMaterById(@PathVariable("id") Integer id){
        Master master = masterService.getMasterById(id);
        return master;
    }

}
