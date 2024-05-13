package com.ls.springDemo.controller;

import com.ls.springDemo.service.Service2;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lishun
 * @description: TODO
 * @date 2024年05月13日
 * @version: 1.0
 */
@RestController
@RequestMapping("controller2")
public class Controller2 extends BaseController<Service2> {
}
