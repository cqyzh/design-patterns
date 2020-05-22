package com.yzh.designpatterns.factory;

/**
 * @classname: Test
 * @desc: 工厂方法模式--测试类
 *        工厂方法模式，每增加一直具体的产品，都需要新增一种工厂子类和产品子类，会导致类越来越多，
 *        但是符合开闭原则。简单工厂模式，采用静态方法，根据不同的参数值，创建对应的产品，但是每新增
 *        一个具体的产品，都需要修改工厂类，不符合开闭原则。
 * @author: YZ
 * @date: 2020/5/20 14:44
 * @version: 1.0
 **/
public class Test {

    public static void main(String[] args) {
        Factory dbFaactory = new DbFaactory();
        dbFaactory.createLogger().writeLog("测试===============");

        Factory fileFactory = new FileFactory();
        fileFactory.createLogger().writeLog("测试===============");

    }
}
