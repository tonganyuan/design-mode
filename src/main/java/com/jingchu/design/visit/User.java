package com.jingchu.design.visit;

/**
 * @author: tonganyuan
 * @Description:
 * @Date: 2023/4/5 11:08
 */
public abstract class User {

    private String name;

    private String identity;

    private String clazz;

    public User(String name, String identity, String clazz) {
        this.name = name;
        this.identity = identity;
        this.clazz = clazz;
    }

    public abstract void accept(Visitor visitor);
}
