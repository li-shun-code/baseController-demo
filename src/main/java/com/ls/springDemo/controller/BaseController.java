package com.ls.springDemo.controller;

import com.ls.springDemo.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author lishun
 * @description: TODO
 * @date 2024年05月13日
 * @version: 1.0
 */
public class BaseController<S extends BaseService> {

    @Autowired
    private S service;


    @GetMapping("/list")
    public String list(){
        return service.list();
    }

    @GetMapping("/get")
    public String get(){
        return service.get("1");
    }

}
