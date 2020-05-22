package com.yzh.designpatterns.command;

import lombok.extern.slf4j.Slf4j;

/**
 * @classname: Light
 * @desc: 灯
 * @author: YZ
 * @date: 2020/5/22 14:24
 * @version: 1.0
 **/
@Slf4j
public class Light {

    public void on(){
       log.info("开灯");
    }

    public void off(){
        log.info("关灯");
    }
}
