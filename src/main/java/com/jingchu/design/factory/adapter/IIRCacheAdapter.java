package com.jingchu.design.factory.adapter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: tonganyuan
 * @Description:
 * @Date: 2023/3/18 9:41
 */
public class IIRCacheAdapter implements ICacheAdapter {


    private static final Map<String, Object> EGM_CACHE = new HashMap<>();

    @Override
    public void set(String key, Object value) {
        System.out.println("iir 添加了一个缓存：" + key + "value= " + value.toString());
        EGM_CACHE.put(key, value);
    }

    @Override
    public Object get(String key) {
        System.out.println("IIR 查询一个缓存：" + key + "value= " + EGM_CACHE.get(key));
        return EGM_CACHE.get(key);
    }
}
