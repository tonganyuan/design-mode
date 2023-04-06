package com.jingchu.design.rpc.config;

/**
 * @author: tonganyuan
 * @Description:
 * @Date: 2023/4/5 20:07
 */
public class ProviderConfig {

    //接口
    private String nozzle;

    //映射
    private String ref;

    //别名
    private String alias;

    public String getNozzle() {
        return nozzle;
    }

    public void setNozzle(String nozzle) {
        this.nozzle = nozzle;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Override
    public String toString() {
        return "ProviderConfig{" +
                "nozzle='" + nozzle + '\'' +
                ", ref='" + ref + '\'' +
                ", alias='" + alias + '\'' +
                '}';
    }
}
