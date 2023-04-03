package com.jingchu.design.memento;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: tonganyuan
 * @Description:
 * @Date: 2023/4/3 22:02
 */
public class Admin {

    private int cursor = 0;

    private List<ConfigMemento<?>> configMementoList = new ArrayList<>();

    private Map<String,ConfigMemento<?>> mementoMap = new HashMap<>();

    public void appendMemento(ConfigMemento<?> memento){
        configMementoList.add(memento);
        cursor++;
    }

    public ConfigMemento<?> undo(){
        if(--cursor <=0){
            return configMementoList.get(0);
        }
        return configMementoList.get(cursor);
    }

    public ConfigMemento<?> redo(){
        if(++cursor > configMementoList.size()-1){
            return configMementoList.get(configMementoList.size() - 1);
        }
        return configMementoList.get(cursor);
    }
}
