package com.jingchu.design.decortor;

import com.jingchu.design.decortor.mode.LoginSsoDecortor;

/**
 * @author: tonganyuan
 * @Description:
 * @Date: 2023/3/25 10:33
 */
public class DecortorApp {

    public static void main(String[] args) {
        LoginSsoDecortor loginSsoDecortor = new LoginSsoDecortor(new SsoInterceptor());
        String request = "1successhuahua";
        boolean b = loginSsoDecortor.preHandle(request, "fdfdfdfdf", "t");
        System.out.println(b);
    }
}
