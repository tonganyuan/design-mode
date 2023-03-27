package com.jingchu.design.command;

/**
 * @author: tonganyuan
 * @Description:
 * @Date: 2023/3/27 22:39
 */
public class XiaoErApp {

    public static void main(String[] args) {
        XiaoEr xiaoEr = new XiaoEr();
        xiaoEr.order(new GuangdongCuisine(new GuangdongCook()));
        xiaoEr.order(new AnhuiCuisine(new AnhuiCook()));
        xiaoEr.placeOrder();
    }
}
