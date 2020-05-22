package com.yzh.designpatterns.strategy.impl;

import com.yzh.designpatterns.strategy.IDefendBehavior;
import lombok.extern.slf4j.Slf4j;

/**
 * @classname: DefendTBS
 * @desc: 策略模式--具体的功能
 * @author: YZ
 * @date: 2020/5/22 10:59
 * @version: 1.0
 **/
@Slf4j
public class DefendTBS implements IDefendBehavior {
    @Override
    public void defend() {
        log.info("铁布衫");
    }
}
