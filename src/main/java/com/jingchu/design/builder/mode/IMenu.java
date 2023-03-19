package com.jingchu.design.builder.mode;

import com.jingchu.design.builder.IMatter;

/**
 * @author: tonganyuan
 * @Description:
 * @Date: 2023/3/19 19:46
 */
public interface IMenu {

    IMenu appendCelling(IMatter matter);

    IMenu appendCoat(IMatter matter);

    String getDetail();
}
