package com.jingchu.design.event;

/**
 * @author: tonganyuan
 * @Description:
 * @Date: 2023/4/5 10:02
 */
public class EventApp {

    public static void main(String[] args) {
        LottyServiceImpl lottyService = new LottyServiceImpl();
        lottyService.lotty(11112L);
    }
}
