package com.yzh.designpatterns.builder;

/**
 * @classname: Director
 * @desc: 建造者模式--指挥者：按照具体的顺序制造产品
 * @author: YZ
 * @date: 2020/5/18 9:31
 * @version: 1.0
 **/
public class Director {

    /**
     * 指挥创建者按照顺序制造产品
     * @param builder
     * @return
     */
    public Product create(Builder builder){
        builder.buildC();
        builder.buildB();
        builder.buildA();
        return builder.getProduct();
    }
}
