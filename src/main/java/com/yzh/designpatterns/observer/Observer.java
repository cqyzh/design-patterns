package com.yzh.designpatterns.observer;

/**
 * @classname: Observer
 * @desc: 观察者模式--观察者
 * @author: YZ
 * @date: 2020/5/15 14:20
 * @version: 1.0
 **/
public abstract class Observer {

      protected Subject subject;

    /**
     * 订阅消息更新
     */
    public abstract void update();
}
