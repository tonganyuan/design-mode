package com.jingchu.design.command;

/**
 * @author: tonganyuan
 * @Description:
 * @Date: 2023/3/27 22:39
 */
public class XiaoErApp {


    /**
     * 在以下条件下可以考虑使用命令模式：
     *            • 如果需要抽象出需要执行的动作，并参数化这些对象，可以选用命令模式。将这些需要执行的动作抽象成为命令，然后实现命令的参数化配置。
     *            • 如果需要在不同的时刻指定、排列和执行请求，可以选用命令模式。将这些请求封装成为命令对象，然后实现将请求队列化。
     *            • 如果需要支持取消操作，可以选用命令模式，通过管理命令对象，能很容易地实现命令的恢复和重做功能。
     *            • 如果需要支持当系统崩溃时，能将系统的操作功能重新执行一遍，可以选用命令模式。将这些操作功能的请求封装成命令对象，然后实现日志命令，就可以在系统恢复以后，通过日志获取命令列表，从而重新执行一遍功能。
     *            • 在需要事务的系统中，可以选用命令模式。命令模式提供了对事务进行建模的方法。命令模式有一个别名就是Transaction。
     * ————————————————
     * @param args
     */
    public static void main(String[] args) {
        XiaoEr xiaoEr = new XiaoEr();
        xiaoEr.order(new GuangdongCuisine(new GuangdongCook()));
        xiaoEr.order(new AnhuiCuisine(new AnhuiCook()));
        xiaoEr.placeOrder();
    }
}
