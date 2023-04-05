package com.jingchu.design.event;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: tonganyuan
 * @Description:
 * @Date: 2023/4/5 10:06
 */
public class EventManager {

    private static Map<EventType, List<EventListener>> eventListenerMap = new HashMap<>();

    static {
        eventListenerMap.put(EventType.MQ,new ArrayList<>());
        eventListenerMap.put(EventType.SMS,new ArrayList<>());
    }

    public void subcripe(EventType eventType,EventListener eventListener){
        eventListenerMap.get(eventType).add(eventListener);
    }

    public void unSubcribe(EventType eventType,EventListener eventListener){
        eventListenerMap.get(eventType).remove(eventListener);
    }

    public void notify(EventType eventType,LottyResult lottyResult){
        List<EventListener> eventListeners = eventListenerMap.get(eventType);
        for (EventListener eventListener : eventListeners) {
            eventListener.doEvent(lottyResult);
        }
    }

    public enum EventType {
        MQ, SMS
    }
}
