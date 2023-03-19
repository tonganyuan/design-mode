package com.jingchu.design.factory;

/**
 * @author: tonganyuan
 * @Description:
 * @Date: 2023/3/18 9:35
 */
public interface ICacheService {

    public void set(String key,Object value);

    public Object get(String key);
}
