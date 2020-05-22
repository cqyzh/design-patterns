package com.yzh.designpatterns.factory;

/**
 * @classname: FileFactory
 * @desc: 工厂方法模式--具体的工厂类 生成具体的产品
 * @author: YZ
 * @date: 2020/5/20 14:43
 * @version: 1.0
 **/
public class FileFactory implements Factory{
    @Override
    public Logger createLogger() {
        return new FileLogger();
    }
}
