package com.yzh.designpatterns.builder;

import lombok.extern.slf4j.Slf4j;

/**
 * @classname: ConcreteBuilder
 * @desc: 建造者模式--具体创建者:实现抽象创建者中的公共接口
 * @author: YZ
 * @date: 2020/5/18 9:29
 * @version: 1.0
 **/
@Slf4j
public class ConcreteBuilder extends Builder{

    private Product product;

    public ConcreteBuilder() {
        product = new Product();
    }

    @Override
    void buildA() {
        log.info("创建A");
        product.setBuildA("创建A");
    }

    @Override
    void buildB() {
        log.info("创建B");
        product.setBuildB("创建B");
    }

    @Override
    void buildC() {
        log.info("创建C");
        product.setBuildC("创建C");
    }

    @Override
    Product getProduct() {
        return product;
    }
}
