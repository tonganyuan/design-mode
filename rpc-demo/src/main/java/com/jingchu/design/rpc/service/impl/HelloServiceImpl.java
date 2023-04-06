package com.jingchu.design.rpc.service.impl;

import com.jingchu.design.rpc.service.HelloService;

/**
 * @author: tonganyuan
 * @Description:
 * @Date: 2023/4/5 21:41
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public void echo() {
        System.out.println("hello service");
    }
}
