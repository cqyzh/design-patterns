package com.yzh.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @classname: Subject
 * @desc: 观察者模式--主题
 * @author: YZ
 * @date: 2020/5/15 14:19
 * @version: 1.0
 **/
public class Subject {

    //存储订阅了主题的观察者列表
    private List<Observer>observers = new ArrayList<>();

    //主题 需要发送给订阅者的数据
    private int state;


    public void setState(int state ){
        this.state = state;
        notifyAllObservers();
    }

    public int getState(){
        return state;
    }

    /**
     * 添加观察者(订阅者)
     * @param observer
     */
    public void addObserver(Observer observer){
        observers.add(observer);
    }

    /**
     * 主题发生变化，需要通知所有的观察者（订阅者）
     */
    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
