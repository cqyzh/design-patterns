package com.yzh.designpatterns.adapter;

/**
 * @classname: Test
 * @desc: 适配器模式--测试类
 * @author: YZ
 * @date: 2020/5/22 13:52
 * @version: 1.0
 **/
public class Test {

    public static void main(String[] args) {
        Mobile mobile = new Mobile();

        V5Power v5Power = new V5PowerAdapter(new V220Power());
        mobile.inputPower(v5Power);
    }
}
