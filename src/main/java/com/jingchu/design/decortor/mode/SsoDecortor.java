package com.jingchu.design.decortor.mode;

import com.jingchu.design.decortor.HandlerInterceptor;

/**
 * @author: tonganyuan
 * @Description:
 * @Date: 2023/3/25 10:29
 */
public abstract class SsoDecortor implements HandlerInterceptor {

    private final HandlerInterceptor handlerInterceptor;

    public SsoDecortor(HandlerInterceptor handlerInterceptor) {
        this.handlerInterceptor = handlerInterceptor;
    }

    @Override
    public boolean preHandle(String request, String response, Object handler) {
        return handlerInterceptor.preHandle(request, response, handler);
    }
}
