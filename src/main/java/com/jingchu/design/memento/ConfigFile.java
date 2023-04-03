package com.jingchu.design.memento;

import java.util.Date;

/**
 * @author: tonganyuan
 * @Description:
 * @Date: 2023/4/3 21:56
 */
public class ConfigFile {

    private String versionNo;

    private String content;

    private Date dateTime;

    private String operator;

    public ConfigFile(String versionNo, String content, Date dateTime, String operator) {
        this.versionNo = versionNo;
        this.content = content;
        this.dateTime = dateTime;
        this.operator = operator;
    }

    public String getVersionNo() {
        return versionNo;
    }

    public void setVersionNo(String versionNo) {
        this.versionNo = versionNo;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {
        return "ConfigFile{" +
                "versionNo='" + versionNo + '\'' +
                ", content='" + content + '\'' +
                ", dateTime=" + dateTime +
                ", operator='" + operator + '\'' +
                '}';
    }
}
