package com.jingchu.design.command;

/**
 * @author: tonganyuan
 * @Description:
 * @Date: 2023/3/27 22:37
 */
public class GuangdongCuisine implements ICuisine{

    private ICook cook;

    public GuangdongCuisine(ICook cook) {
        this.cook = cook;
    }

    @Override
    public void cook() {
        cook.doCooking();
    }
}
