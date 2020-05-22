package com.yzh.designpatterns.decoration;

/**
 * @classname: MilkTea
 * @desc: 具体被装饰对象--奶茶基类
 * @author: YZ
 * @date: 2020/5/18 14:45
 * @version: 1.0
 **/
public class MilkTea extends Tea{
    @Override
    public String desc() {
        return "奶茶";
    }

    @Override
    public double cost() {
        return 8.0;
    }
}
