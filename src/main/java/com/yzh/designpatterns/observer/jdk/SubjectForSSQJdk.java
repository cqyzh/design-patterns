package com.yzh.designpatterns.observer.jdk;

import java.util.Observable;

/**
 * @classname: SubjectSSQ
 * @desc: 使用jdk自带的观察者模式 实现自定义观察者--主题（双色球）
 * @author: YZ
 * @date: 2020/5/21 11:24
 * @version: 1.0
 **/
public class SubjectForSSQJdk extends Observable {

    private String msg;

    public final String subjectName = "双色球";

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
        //改变状态
        super.setChanged();
        //通知订阅者
        super.notifyObservers(msg);
    }
}
