package com.yzh.designpatterns.observer.jdk;

import lombok.extern.slf4j.Slf4j;

import java.util.Observable;
import java.util.Observer;

/**
 * @classname: ObserverFor3dJdk
 * @desc: 使用jdk自带的观察者模式 实现自定义观察者--订阅者（观察者）
 * @author: YZ
 * @date: 2020/5/21 11:12
 * @version: 1.0
 **/
@Slf4j
public class Observer1 implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof SubjectFor3dJdk){
            SubjectFor3dJdk subjectFor3dJdk = (SubjectFor3dJdk) o;
            log.info("主题为："+subjectFor3dJdk.subjectName+",消息是："+arg);
        }else  if (o instanceof SubjectForSSQJdk){
            SubjectForSSQJdk subjectForSSQJdk = (SubjectForSSQJdk) o;
            log.info("主题为："+subjectForSSQJdk.subjectName+",消息是："+arg);
        }
    }
}
