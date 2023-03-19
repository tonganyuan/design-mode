package com.jingchu.design.builder.coat;

import com.jingchu.design.builder.IMatter;

import java.math.BigDecimal;

/**
 * @author: tonganyuan
 * @Description:
 * @Date: 2023/3/19 19:29
 */
public class DuluxCoat implements IMatter {
    @Override
    public String scene() {
        return "涂料";
    }

    @Override
    public String brand() {
        return "多乐士";
    }

    @Override
    public String model() {
        return "第二代";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(719);
    }

    @Override
    public String desc() {
        return "多乐士是阿克苏诺贝尔旗下的著名建筑装饰油漆品牌，产品畅销100多个国家。";
    }
}
