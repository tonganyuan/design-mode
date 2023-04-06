package com.jingchu.design.rpc.config.bean;

import com.jingchu.design.rpc.config.ProviderConfig;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author: tonganyuan
 * @Description:
 * @Date: 2023/4/5 20:06
 */
public class ProviderBean extends ProviderConfig implements ApplicationContextAware {

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        //注册服务到注册中心
    }
}
