package com.ls.springDemo.service.impl;

import com.ls.springDemo.service.Service2;
import org.springframework.stereotype.Service;

/**
 * @author lishun
 * @description: TODO
 * @date 2024年05月13日
 * @version: 1.0
 */
@Service
public class Service2Impl implements Service2 {
    @Override
    public String list() {
        return "list2";
    }

    @Override
    public String get(String id) {
        return "get2";
    }
}
