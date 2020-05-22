package com.yzh.designpatterns.factory;

import lombok.extern.slf4j.Slf4j;

/**
 * @classname: DbLogger
 * @desc: 工厂方法模式--具体的产品 继承（实现）产品基类
 * @author: YZ
 * @date: 2020/5/20 14:42
 * @version: 1.0
 **/
@Slf4j
public class DbLogger implements Logger{
    @Override
    public void writeLog(String message) {
        log.info("这是数据库日志基类器："+message);
    }
}
