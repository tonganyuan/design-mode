package com.jingchu.design.rpc.config.bean;

import com.jingchu.design.rpc.config.ConsumerConfig;
import com.jingchu.design.rpc.utils.ClassLoaderUtils;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author: tonganyuan
 * @Description:
 * @Date: 2023/4/5 20:06
 */
public class ConsumerBean<T> extends ConsumerConfig<T> implements FactoryBean {
    @Override
    public Object getObject() throws Exception {
        //实现socket连接 和信息发送
        return this;
    }

    @Override
    public Class<?> getObjectType() {
        try {
            return ClassLoaderUtils.forName(nozzle);
        } catch (ClassNotFoundException e) {
            return null;
        }
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
