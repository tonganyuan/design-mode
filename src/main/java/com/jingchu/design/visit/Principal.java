package com.jingchu.design.visit;

/**
 * @author: tonganyuan
 * @Description:
 * @Date: 2023/4/5 11:14
 */
public class Principal implements Visitor{
    @Override
    public void visit(Student student) {
        System.out.println("校长希望看到学生的人数");
    }

    @Override
    public void visit(Teature teature) {
        System.out.println("校长希望看到老师的升学率");
    }
}
