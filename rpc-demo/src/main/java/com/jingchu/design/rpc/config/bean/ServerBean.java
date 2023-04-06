package com.jingchu.design.rpc.config.bean;

import com.jingchu.design.rpc.config.ServerConfig;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author: tonganyuan
 * @Description:
 * @Date: 2023/4/5 20:06
 */
public class ServerBean extends ServerConfig implements ApplicationContextAware {

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        //注册中心启动和初始化通信服务
    }
}
