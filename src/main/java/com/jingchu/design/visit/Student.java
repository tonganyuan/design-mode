package com.jingchu.design.visit;

import java.util.Random;

/**
 * @author: tonganyuan
 * @Description:
 * @Date: 2023/4/5 11:10
 */
public class Student extends User {

    public Student(String name, String identity, String clazz) {
        super(name, identity, clazz);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int ranking() {

        return (int) (Math.random() * 100);
    }
}
