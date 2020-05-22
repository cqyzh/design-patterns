package com.yzh.designpatterns.observer;

import lombok.extern.slf4j.Slf4j;

/**
 * @classname: BinaryObserver
 * @desc: 观察者模式--具体的观察者
 * @author: YZ
 * @date: 2020/5/15 14:29
 * @version: 1.0
 **/
@Slf4j
public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        //将观察者添加到订阅列表中
        this.subject.addObserver(this);
    }

    @Override
    public void update() {
        log.info("Binary String:"+Integer.toBinaryString(this.subject.getState()));
    }
}
