package com.yzh.designpatterns.adapter;

import lombok.extern.slf4j.Slf4j;

/**
 * @classname: Mobile
 * @desc: 适配器模式--手机充电：将220v转换为5v
 * @author: YZ
 * @date: 2020/5/22 11:55
 * @version: 1.0
 **/
@Slf4j
public class Mobile {

    public void inputPower(V5Power v5Power){
        log.info("我需要5v的电压充电，现在的电压是："+v5Power.provider5V()+"v");
    }
}
