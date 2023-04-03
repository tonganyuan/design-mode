package com.jingchu.design.memento;

/**
 * @author: tonganyuan
 * @Description:
 * @Date: 2023/4/3 21:58
 */
public class ConfigOriginator<T> {

    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ConfigOriginator(T data) {
        this.data = data;
    }

    public ConfigMemento<T> saveMemento() {
        return new ConfigMemento<>(this.data);
    }

    public void getMemento(ConfigMemento<T> memento) {
        this.data = memento.getData();
    }
}
