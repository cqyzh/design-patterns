package com.yzh.designpatterns.decoration;

import lombok.extern.slf4j.Slf4j;

/**
 * @classname: Test
 * @desc: 装饰者模式--测试类
 * @author: YZ
 * @date: 2020/5/18 14:51
 * @version: 1.0
 **/
@Slf4j
public class Test {
    public static void main(String[] args) {
        Tea tea = new MilkTea();
        log.info("milk tea 具体价格："+tea.cost());

        tea = new Oats(tea);

        log.info("Oats的价格是："+tea.cost());
    }
}
