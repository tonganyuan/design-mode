package com.jingchu.design.event;

/**
 * @author: tonganyuan
 * @Description:
 * @Date: 2023/4/5 10:05
 */
public class MqEventListener implements EventListener{
    @Override
    public void doEvent(LottyResult lottyResult) {
        System.out.println("发送mq消息：" + lottyResult.toString());
    }
}
