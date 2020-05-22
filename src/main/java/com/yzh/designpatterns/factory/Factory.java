package com.yzh.designpatterns.factory;

/**
 * @classname: Factory
 * @desc: 工厂方法模式--抽象工厂类 定义统一的工厂方法
 * @author: YZ
 * @date: 2020/5/20 14:37
 * @version: 1.0
 **/
public interface Factory {

    Logger createLogger();
}
