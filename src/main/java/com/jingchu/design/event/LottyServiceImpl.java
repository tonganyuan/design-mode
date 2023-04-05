package com.jingchu.design.event;

import sun.nio.cs.US_ASCII;

import java.util.Date;

/**
 * @author: tonganyuan
 * @Description:
 * @Date: 2023/4/5 10:14
 */
public class LottyServiceImpl implements LottyService{

    private static final EventManager EVENT_MANAGER = new EventManager();

    static {
        EVENT_MANAGER.subcripe(EventManager.EventType.MQ,new MqEventListener());
        EVENT_MANAGER.subcripe(EventManager.EventType.SMS,new SmsEventListener());
    }

    @Override
    public LottyResult lotty(Long userId) {
        String result = Math.abs(userId.hashCode()) % 2 == 0 ? "恭喜你" + userId + "摇号成功" : "恭喜你" + userId + "摇号失败";
        LottyResult result1 = new LottyResult(userId,result,new Date());
        EVENT_MANAGER.notify(EventManager.EventType.MQ,result1);
        EVENT_MANAGER.notify(EventManager.EventType.SMS,result1);
        return result1;
    }
}
