package com.jingchu.design.rpc.config;

/**
 * @author: tonganyuan
 * @Description:
 * @Date: 2023/4/5 20:07
 */
public class ServerConfig {

    protected String host;  //注册中心地址
    protected int port;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "ServerConfig{" +
                "host='" + host + '\'' +
                ", port=" + port +
                '}';
    }
}
