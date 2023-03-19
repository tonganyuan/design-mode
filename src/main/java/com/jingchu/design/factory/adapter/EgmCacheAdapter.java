package com.jingchu.design.factory.adapter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: tonganyuan
 * @Description:
 * @Date: 2023/3/18 9:38
 */
public class EgmCacheAdapter implements ICacheAdapter {

    private static final Map<String, Object> EGM_CACHE = new HashMap<>();

    @Override
    public void set(String key, Object value) {
        System.out.println("egm 添加了一个缓存：" + key + "value= " + value.toString());
        EGM_CACHE.put(key, value);
    }

    @Override
    public Object get(String key) {
        System.out.println("egm 查询一个缓存：" + key + "value= " + EGM_CACHE.get(key));
        return EGM_CACHE.get(key);
    }
}
