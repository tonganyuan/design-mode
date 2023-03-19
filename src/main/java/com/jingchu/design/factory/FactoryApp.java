package com.jingchu.design.factory;

import com.jingchu.design.factory.adapter.EgmCacheAdapter;
import com.jingchu.design.factory.adapter.IIRCacheAdapter;

/**
 * @author: tonganyuan
 * @Description:
 * @Date: 2023/3/18 9:47
 */
public class FactoryApp {

    public static void main(String[] args) throws Exception {
        ICacheService proxy = JDKProxyFactory.getProxy(ICacheService.class, EgmCacheAdapter.class);

        proxy.set("egm","test egmvalue");

        proxy.get("egm");

        ICacheService proxy2 = JDKProxyFactory.getProxy(ICacheService.class, IIRCacheAdapter.class);

        proxy2.set("iir","test egmvalue");

        proxy2.get("iir");
    }
}
