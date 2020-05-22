package com.yzh.designpatterns.factory;

/**
 * @classname: DbFaactory
 * @desc: 工厂方法模式--具体的工厂类 生成具体的产品
 * @author: YZ
 * @date: 2020/5/20 14:41
 * @version: 1.0
 **/
public class DbFaactory implements Factory{
    @Override
    public Logger createLogger() {
        return new DbLogger();
    }
}
