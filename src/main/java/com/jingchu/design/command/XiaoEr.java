package com.jingchu.design.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: tonganyuan
 * @Description:
 * @Date: 2023/3/27 22:39
 */
public class XiaoEr {

    private List<ICuisine> cuisineList = new ArrayList<>();

    public void order(ICuisine cuisine){
        cuisineList.add(cuisine);
    }

    public void placeOrder() {
        for (ICuisine iCuisine : this.cuisineList) {
            iCuisine.cook();
        }
        cuisineList.clear();
    }
}
