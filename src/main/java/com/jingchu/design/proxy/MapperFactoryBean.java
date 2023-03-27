package com.jingchu.design.proxy;

import com.jingchu.design.proxy.dao.Select;
import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author: tonganyuan
 * @Description:
 * @Date: 2023/3/25 19:13
 */
public class MapperFactoryBean<T> implements FactoryBean<T> {

    private Class<T> mapperInterface;

    public MapperFactoryBean(Class<T> mapperInterface) {
        this.mapperInterface = mapperInterface;
    }

    @Override
    public T getObject() throws Exception {
        InvocationHandler invocationHandler = (proxy, method, args) -> {
            Select select = method.getAnnotation(Select.class);
            System.out.println("打印sql:" + select.value().replace("#{uid}", args[0].toString()));
            return "到底执行了什么玩意";
        };
        return (T) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{mapperInterface}, invocationHandler);
    }

    @Override
    public Class<?> getObjectType() {
        return mapperInterface;
    }
}
