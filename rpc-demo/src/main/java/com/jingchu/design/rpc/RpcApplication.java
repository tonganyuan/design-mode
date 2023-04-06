package com.jingchu.design.rpc;

import com.jingchu.design.rpc.config.bean.ConsumerBean;
import com.jingchu.design.rpc.config.bean.ProviderBean;
import com.jingchu.design.rpc.config.bean.ServerBean;
import com.jingchu.design.rpc.utils.ClassLoaderUtils;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: tonganyuan
 * @Description:
 * @Date: 2023/4/5 17:32
 */
public class RpcApplication {

    public static void main(String[] args) {
        String[] configs = {"rpc-center.xml","rpc-consumer.xml","rpc-provider.xml"};
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(configs);
        ServerBean rpc_center = (ServerBean) classPathXmlApplicationContext.getBean("rpc_center");
        ProviderBean rpc_provider = (ProviderBean) classPathXmlApplicationContext.getBean("rpc_provider");
        ConsumerBean rpc_consumer = (ConsumerBean) classPathXmlApplicationContext.getBean("rpc_consumer");

        System.out.println("注册中心配置：\t" + rpc_center + "\r\n" + "消费配置：\t" + rpc_consumer.toString() + "\r\n" + "服务配置：\t" + rpc_provider.toString()) ;

    }
}
