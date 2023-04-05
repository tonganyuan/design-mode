package com.jingchu.design.event;

import java.util.Date;

/**
 * @author: tonganyuan
 * @Description:
 * @Date: 2023/4/5 10:03
 */
public class LottyResult {

    private Long userId;

    private String msg;

    private Date time;

    public LottyResult(Long userId, String msg, Date time) {
        this.userId = userId;
        this.msg = msg;
        this.time = time;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "LottyResult{" +
                "userId='" + userId + '\'' +
                ", msg='" + msg + '\'' +
                ", time=" + time +
                '}';
    }
}
