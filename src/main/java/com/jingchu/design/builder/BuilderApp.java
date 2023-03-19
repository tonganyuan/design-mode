package com.jingchu.design.builder;

import com.jingchu.design.builder.mode.Builder;
import com.jingchu.design.builder.origin.DecorationPackageController;

import java.math.BigDecimal;

/**
 * @author: tonganyuan
 * @Description:
 * @Date: 2023/3/19 18:46
 */
public class BuilderApp {

    public static void main(String[] args) {
        //原始方案
//        DecorationPackageController decorationPackageController = new DecorationPackageController();
//        System.out.printf("欧式风格 ： " + decorationPackageController.getMatterList(new BigDecimal(100), 1));
//        System.out.printf("轻奢风格：" + decorationPackageController.getMatterList(new BigDecimal(100), 2));

        System.out.printf(Builder.levelOne(new BigDecimal(100)).getDetail());
        System.out.println("/r/n");
        System.out.printf(Builder.levelTwo(new BigDecimal(100)).getDetail());
    }
}
