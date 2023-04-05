package com.jingchu.design.visit;

/**
 * @author: tonganyuan
 * @Description:
 * @Date: 2023/4/5 11:10
 */
public class Teature extends User {

    public Teature(String name, String identity, String clazz) {
        super(name, identity, clazz);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
