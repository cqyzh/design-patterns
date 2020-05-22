package com.yzh.designpatterns.strategy.impl;

import com.yzh.designpatterns.strategy.IRunBehavior;
import lombok.extern.slf4j.Slf4j;

/**
 * @classname: RunJCTQ
 * @desc: 策略模式--具体的功能
 * @author: YZ
 * @date: 2020/5/22 10:22
 * @version: 1.0
 **/
@Slf4j
public class RunJCTQ implements IRunBehavior {
    @Override
    public void run() {
        log.info("金蝉脱壳");
    }
}
