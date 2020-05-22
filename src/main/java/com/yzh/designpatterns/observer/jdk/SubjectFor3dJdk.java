package com.yzh.designpatterns.observer.jdk;

import java.util.Observable;

/**
 * @classname: SubjectJdk
 * @desc: 使用jdk自带的观察者模式 实现自定义观察者--主题（3D彩票）
 * @author: YZ
 * @date: 2020/5/21 11:00
 * @version: 1.0
 **/
public class SubjectFor3dJdk extends Observable {

    private String msg;

    public final String subjectName = "3D彩票";

    public String getMsg(){
        return this.msg;
    }

    /**
     * 消息更新
     * @param msg
     */
    public void setMsg(String msg) {
        this.msg = msg;
        //改变状态
        super.setChanged();
        //通知订阅者
        super.notifyObservers(msg);
    }
}
