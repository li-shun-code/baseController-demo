package com.ls.springDemo.controller;

import com.ls.springDemo.service.Service1;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lishun
 * @description: TODO
 * @date 2024年05月13日
 * @version: 1.0
 */
@RestController
@RequestMapping("controller1")
public class Controller1 extends BaseController<Service1> {

    @Override
    @GetMapping("list")
    public String list() {
        return "2";
    }
}
