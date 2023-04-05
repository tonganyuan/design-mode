package com.jingchu.design.event;

/**
 * @author: tonganyuan
 * @Description:
 * @Date: 2023/4/5 10:06
 */
public class SmsEventListener implements EventListener {
    @Override
    public void doEvent(LottyResult lottyResult) {
        System.out.println("发送短信信息：" + lottyResult.toString());
    }
}
