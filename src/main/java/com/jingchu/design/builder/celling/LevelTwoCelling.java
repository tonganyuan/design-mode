package com.jingchu.design.builder.celling;

import com.jingchu.design.builder.IMatter;

import java.math.BigDecimal;

/**
 * @author: tonganyuan
 * @Description:
 * @Date: 2023/3/19 19:12
 */
public class LevelTwoCelling implements IMatter {
    @Override
    public String scene() {
        return "吊顶";
    }

    @Override
    public String brand() {
        return "装修公司自带";
    }

    @Override
    public String model() {
        return "二级顶";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(850);
    }

    @Override
    public String desc() {
        return null;
    }
}
