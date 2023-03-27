package com.jingchu.design.proxy;

import com.jingchu.design.proxy.dao.IUserDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: tonganyuan
 * @Description:
 * @Date: 2023/3/25 18:51
 */
public class ProxyApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        IUserDao userDao = classPathXmlApplicationContext.getBean("userDao", IUserDao.class);
        String s = userDao.queryUserInfo("10002");
        System.out.println(s);
    }
}
