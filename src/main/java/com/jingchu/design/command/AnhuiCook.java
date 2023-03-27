package com.jingchu.design.command;

/**
 * @author: tonganyuan
 * @Description:
 * @Date: 2023/3/27 22:38
 */
public class AnhuiCook implements ICook{
    @Override
    public void doCooking() {
        System.out.println("我会烧好吃的安徽菜");
    }
}
