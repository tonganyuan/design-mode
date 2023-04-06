package com.jingchu.design.rpc.config;

/**
 * @author: tonganyuan
 * @Description:
 * @Date: 2023/4/5 20:06
 */
public class ConsumerConfig<T> {

    protected String nozzle;

    protected String alias;

    public String getNozzle() {
        return nozzle;
    }

    public void setNozzle(String nozzle) {
        this.nozzle = nozzle;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Override
    public String toString() {
        return "ConsumerConfig{" +
                "nozzle='" + nozzle + '\'' +
                ", alias='" + alias + '\'' +
                '}';
    }
}
