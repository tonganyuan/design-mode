package com.jingchu.design.memento;

import java.util.Date;

/**
 * @author: tonganyuan
 * @Description:
 * @Date: 2023/4/3 21:55
 */
public class MementoApp {

    public static void main(String[] args) {
        ConfigFile configFile1 = new ConfigFile("1", "peizhi1", new Date(), "张三");
        Admin admin = new Admin();
        ConfigOriginator<ConfigFile> objectConfigOriginator = new ConfigOriginator<>(configFile1);
        admin.appendMemento(objectConfigOriginator.saveMemento());
        ConfigFile configFile12 = new ConfigFile("2", "peizhi2", new Date(), "里斯");
        objectConfigOriginator.setData(configFile12);
        admin.appendMemento(objectConfigOriginator.saveMemento());
        ConfigFile configFile3= new ConfigFile("3", "peizhi3", new Date(), "王五");
        objectConfigOriginator.setData(configFile3);
        admin.appendMemento(objectConfigOriginator.saveMemento());
        ConfigMemento<?> undo = admin.undo();
        System.out.println("undo:" + undo.getData().toString());
        ConfigMemento<?> redo = admin.redo();
        System.out.println("redo:" + redo.getData().toString());
    }
}
