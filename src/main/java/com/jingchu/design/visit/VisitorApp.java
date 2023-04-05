package com.jingchu.design.visit;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: tonganyuan
 * @Description:
 * @Date: 2023/4/5 11:08
 */
public class VisitorApp {

    public static void main(String[] args) {

        List<User> userList = new ArrayList<>();

        userList.add(new Student("张三","普通班","三年二班"));
        userList.add(new Student("李四","重点班","一年二班"));
        userList.add(new Student("王五","特长班","二年二班"));
        userList.add(new Student("赵六","普通班","四年二班"));
        userList.add(new Teature("张三老师","普通班","三年二班"));
        userList.add(new Teature("李四老师","重点班","一年二班"));
        userList.add(new Teature("王五老师","特长班","二年二班"));
        userList.add(new Teature("赵六老师","普通班","四年二班"));

        Parent parent = new Parent();

        Principal principal = new Principal();


        for (User user : userList) {
            user.accept(parent);
            System.out.println("=========================校长视角==========================");
            user.accept(principal);
        }
    }
}
