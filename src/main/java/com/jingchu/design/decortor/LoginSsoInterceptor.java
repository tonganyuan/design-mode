package com.jingchu.design.decortor;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: tonganyuan
 * @Description:
 * @Date: 2023/3/25 10:24
 */
public class LoginSsoInterceptor extends SsoInterceptor {

    private static final Map<String, String> AUTH_MAP = new ConcurrentHashMap<>(2);

    static {
        AUTH_MAP.put("huahua", "queryUserInfo");
        AUTH_MAP.put("doudou", "queryUserInfo");
    }

    @Override
    public boolean preHandle(String request, String response, Object handler) {
        String ticket = request.substring(1, 8);
        boolean success = ticket.equals("success");
        if (!success) {
            return false;
        }
        String userId = request.substring(8);
        String method = AUTH_MAP.get(userId);
        return method.equals("queryUserInfo");
    }
}
