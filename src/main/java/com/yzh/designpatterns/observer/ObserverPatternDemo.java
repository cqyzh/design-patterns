package com.yzh.designpatterns.observer;

/**
 * @classname: ObserverPatternDemo
 * @desc: 测试代码
 * @author: YZ
 * @date: 2020/5/15 14:33
 * @version: 1.0
 **/
public class ObserverPatternDemo {

    public static void main(String[] args) {
        Subject subject = new Subject();
        new BinaryObserver(subject);
        new HexaObserver(subject);
        subject.setState(15);
    }
}
