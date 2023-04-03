package com.jingchu.design.memento;

/**
 * @author: tonganyuan
 * @Description:
 * @Date: 2023/4/3 21:57
 */
public class ConfigMemento<T> {

    public ConfigMemento(T data) {
        this.data = data;
    }

    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
