package com.jingchu.design.factory;

import com.jingchu.design.factory.adapter.ICacheAdapter;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author: tonganyuan
 * @Description:
 * @Date: 2023/3/16 22:04
 */
public class JdkInvocationHandler implements InvocationHandler {

    private ICacheAdapter cacheAdapter;

    public JdkInvocationHandler(ICacheAdapter cacheAdapter) {
        this.cacheAdapter = cacheAdapter;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(cacheAdapter, args);
    }
}
