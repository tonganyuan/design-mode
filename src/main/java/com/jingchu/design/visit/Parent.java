package com.jingchu.design.visit;

/**
 * @author: tonganyuan
 * @Description:
 * @Date: 2023/4/5 11:11
 */
public class Parent implements Visitor{
    @Override
    public void visit(Student student) {
        System.out.println("父母希望看到学上的成绩排名" + student.toString() + student.ranking());
    }

    @Override
    public void visit(Teature teature) {
        System.out.println("父母希望看到老师的等级" + teature.toString());
    }
}
