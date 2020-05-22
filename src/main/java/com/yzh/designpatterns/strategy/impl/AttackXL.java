package com.yzh.designpatterns.strategy.impl;

import com.yzh.designpatterns.strategy.IAttackBehavior;
import lombok.extern.slf4j.Slf4j;

/**
 * @classname: AttackXL
 * @desc: 策略模式--具体的功能
 * @author: YZ
 * @date: 2020/5/22 10:21
 * @version: 1.0
 **/
@Slf4j
public class AttackXL implements IAttackBehavior {
    @Override
    public void attack() {
        log.info("降龙十八掌");
    }
}
