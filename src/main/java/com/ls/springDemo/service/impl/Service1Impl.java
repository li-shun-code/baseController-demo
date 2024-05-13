package com.ls.springDemo.service.impl;

import com.ls.springDemo.service.Service1;
import org.springframework.stereotype.Service;

/**
 * @author lishun
 * @description: TODO
 * @date 2024年05月13日
 * @version: 1.0
 */
@Service
public class Service1Impl implements Service1 {
    @Override
    public String list() {
        return "list1";
    }

    @Override
    public String get(String id) {
        return "get1";
    }
}
