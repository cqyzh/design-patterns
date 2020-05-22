package com.yzh.designpatterns.adapter;

import lombok.extern.slf4j.Slf4j;

/**
 * @classname: V220Power
 * @desc: 适配器--只能提供220v电压
 * @author: YZ
 * @date: 2020/5/22 13:45
 * @version: 1.0
 **/
@Slf4j
public class V220Power {

    public int provideV220Power(){
        log.info("我只能提供220v的电压。。。");
        return 220;
    }
}
