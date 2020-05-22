package com.yzh.designpatterns.observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * @classname: Test
 * @desc: 用jdk自带的观察者模式 实现自定义观察者--测试类
 * @author: YZ
 * @date: 2020/5/21 11:17
 * @version: 1.0
 **/
public class Test {

    public static void main(String[] args) {
        SubjectFor3dJdk subjectFor3dJdk = new SubjectFor3dJdk();

        Observer observer1 = new Observer1();
        //添加订阅者
        subjectFor3dJdk.addObserver(observer1);
        //3D彩票改变消息
        subjectFor3dJdk.setMsg("我更新了3D彩票为：192515");

        SubjectForSSQJdk subjectForSSQJdk = new SubjectForSSQJdk();
        subjectForSSQJdk.addObserver(observer1);
        //双色球改变消息
        subjectForSSQJdk.setMsg("我更新了双色球为：1165523762");

    }
}
