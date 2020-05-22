package com.yzh.designpatterns.builder;

/**
 * @classname: Builder
 * @desc: 建造者模式--抽象建造者:定义公共接口
 * @author: YZ
 * @date: 2020/5/18 9:23
 * @version: 1.0
 **/
public abstract class Builder {

     abstract void buildA();

     abstract void buildB();

     abstract void buildC();

    /**
     * 获取具体的产品
     * @return
     */
     abstract Product getProduct();
}

