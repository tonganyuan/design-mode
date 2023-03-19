package com.jingchu.design.builder;

import java.math.BigDecimal;

/**
 * @author: tonganyuan
 * @Description:
 * @Date: 2023/3/19 19:13
 */
public interface IMatter {

    String scene();

    String brand();

    String model();

    BigDecimal price();

    String desc();
}
