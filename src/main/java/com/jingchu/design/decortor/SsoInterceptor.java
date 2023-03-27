package com.jingchu.design.decortor;

/**
 * @author: tonganyuan
 * @Description:
 * @Date: 2023/3/25 10:23
 */
public class SsoInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(String request, String response, Object handler) {

        String ticket = request.substring(1, 8);


        return ticket.equals("success");
    }
}
