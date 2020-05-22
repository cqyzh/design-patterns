package com.yzh.designpatterns.abstractFactory;

import lombok.extern.slf4j.Slf4j;

/**
 * @classname: JavaArticle
 * @desc: 抽象工厂模式--具体产品：它定义具体工厂生产的具体产品对象，实现抽象产品接口中声明的业务方法。
 * @author: YZ
 * @date: 2020/5/20 16:51
 * @version: 1.0
 **/
@Slf4j
public class JavaArticle implements Article {
    @Override
    public void produce() {
        log.info("Java记录手记");
    }
}
