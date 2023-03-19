package com.jingchu.design.factory;

import com.jingchu.design.factory.adapter.ICacheAdapter;

import java.lang.reflect.Proxy;

/**
 * @author: tonganyuan
 * @Description:
 * @Date: 2023/3/18 9:42
 */
public class JDKProxyFactory {


    public static <T> T getProxy(Class cacheClazz, Class<? extends ICacheAdapter> cacheAdapter) throws Exception {
        JdkInvocationHandler jdkInvocationHandler = new JdkInvocationHandler(cacheAdapter.newInstance());

        return (T) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),new Class[]{cacheClazz},jdkInvocationHandler);

    }
}
