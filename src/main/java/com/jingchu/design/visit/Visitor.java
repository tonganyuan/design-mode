package com.jingchu.design.visit;

/**
 * @author: tonganyuan
 * @Description:
 * @Date: 2023/4/5 11:09
 */
public interface Visitor {

    void visit(Student student);

    void visit(Teature teature);
}
