package com.yzh.designpatterns.decoration;

/**
 * @classname: tea
 * @desc: 装饰模式--被装饰对象的基类
 *        装饰者和被装饰者拥有共同的基类，继承的目的是继承类型而不是行为
 * @author: YZ
 * @date: 2020/5/18 14:42
 * @version: 1.0
 **/
public abstract class Tea {

    /**
     * 描述
     */
    public abstract String desc();

    /**
     * 价格
     * @return
     */
    public abstract double cost();

}
