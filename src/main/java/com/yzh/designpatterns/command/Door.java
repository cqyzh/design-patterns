package com.yzh.designpatterns.command;

import lombok.extern.slf4j.Slf4j;

/**
 * @classname: Door
 * @desc: 门
 * @author: YZ
 * @date: 2020/5/22 14:22
 * @version: 1.0
 **/
@Slf4j
public class Door {

    public void open(){
        log.info("开门");
    }

    public void close(){
        log.info("关门");
    }
}
