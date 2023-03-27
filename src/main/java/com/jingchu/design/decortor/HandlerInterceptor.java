package com.jingchu.design.decortor;

/**
 * @author: tonganyuan
 * @Description:
 * @Date: 2023/3/25 10:22
 */
public interface HandlerInterceptor {

    boolean preHandle(String request, String response, Object handler);
}
