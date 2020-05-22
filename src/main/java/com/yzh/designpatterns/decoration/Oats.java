package com.yzh.designpatterns.decoration;

/**
 * @classname: Oats
 * @desc:  配料具体装饰者，燕麦。
 * @author: YZ
 * @date: 2020/5/18 14:49
 * @version: 1.0
 **/
public class Oats extends DosingDecorator{
    public Oats(Tea tea) {
        super(tea);
    }

    @Override
    public String desc() {
        return super.desc()+"--燕麦";
    }

    @Override
    public double cost() {
        return super.cost()+1;
    }
}
