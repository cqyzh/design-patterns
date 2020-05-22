package com.yzh.designpatterns.builder;

/**
 * @classname: Client
 * @desc: 建造者模式--客户（测试类）
 * @author: YZ
 * @date: 2020/5/18 9:34
 * @version: 1.0
 **/
public class Test {


    public static void main(String[] args) {
        Director director = new Director();

        Product product = director.create(new ConcreteBuilder());

        System.out.println(product.toString());
    }
}
