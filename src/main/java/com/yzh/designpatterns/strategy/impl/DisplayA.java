package com.yzh.designpatterns.strategy.impl;

import com.yzh.designpatterns.strategy.IDisplayBehavior;
import lombok.extern.slf4j.Slf4j;

/**
 * @classname: DisplayA
 * @desc: 策略模式--具体的功能
 * @author: YZ
 * @date: 2020/5/22 10:57
 * @version: 1.0
 **/
@Slf4j
public class DisplayA implements IDisplayBehavior {
    @Override
    public void display() {
        log.info("样子A");
    }
}
