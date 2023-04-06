package com.jingchu.design.rpc.config.bean;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @author: tonganyuan
 * @Description:
 * @Date: 2023/4/5 20:07
 */
public class MyNamespaceHandler extends NamespaceHandlerSupport {

    @Override
    public void init() {
        registerBeanDefinitionParser("consumer",new MyBeanDefinitionParser(ConsumerBean.class));
        registerBeanDefinitionParser("provider",new MyBeanDefinitionParser(ProviderBean.class));
        registerBeanDefinitionParser("server",new MyBeanDefinitionParser(ServerBean.class));
    }
}
