package com.yzh.designpatterns.factory;

/**
 * @classname: Logger
 * @desc: 工厂方法模式--定义产品接口 是工厂方法模式所创建的所有产品的父类
 * @author: YZ
 * @date: 2020/5/20 14:38
 * @version: 1.0
 **/
public interface Logger {

     void writeLog(String message);
}
