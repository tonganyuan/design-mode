package com.jingchu.design.decortor.mode;

import com.jingchu.design.decortor.HandlerInterceptor;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: tonganyuan
 * @Description:
 * @Date: 2023/3/25 10:31
 */
public class LoginSsoDecortor extends SsoDecortor {

    private static final Map<String, String> AUTH_MAP = new ConcurrentHashMap<>(2);

    static {
        AUTH_MAP.put("huahua", "queryUserInfo");
        AUTH_MAP.put("doudou", "queryUserInfo");
    }

    public LoginSsoDecortor(HandlerInterceptor handlerInterceptor) {
        super(handlerInterceptor);
    }

    @Override
    public boolean preHandle(String request, String response, Object handler) {
        boolean success = super.preHandle(request, response, handler);
        if (!success) {
            return false;
        }
        String userId = request.substring(8);
        String method = AUTH_MAP.get(userId);
        return method.equals("queryUserInfo");
    }
}
