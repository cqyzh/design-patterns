package com.yzh.designpatterns.decoration;

/**
 * @classname: DosingDecorator
 * @desc: 配料装饰者
 * @author: YZ
 * @date: 2020/5/18 14:47
 * @version: 1.0
 **/
public class DosingDecorator extends Tea{

    private Tea tea;

    public DosingDecorator(Tea tea) {
        this.tea = tea;
    }

    @Override
    public String desc() {
        return tea.desc();
    }

    @Override
    public double cost() {
        return tea.cost();
    }
}
