package com.yzh.designpatterns.strategy;

import com.yzh.designpatterns.strategy.impl.AttackXL;
import com.yzh.designpatterns.strategy.impl.DefendTBS;
import com.yzh.designpatterns.strategy.impl.DisplayA;
import com.yzh.designpatterns.strategy.impl.RunJCTQ;
import lombok.extern.slf4j.Slf4j;

/**
 * @classname: Test
 * @desc: 策略模式--测试类
 * @author: YZ
 * @date: 2020/5/22 11:00
 * @version: 1.0
 **/
@Slf4j
public class Test {

    public static void main(String[] args) {
        Role roleA = new RoleA("角色A");

        roleA.setAttackBehavior(new AttackXL())
             .setDefendBehavior(new DefendTBS())
             .setDisplayBehavior(new DisplayA())
             .setRunBehavior(new RunJCTQ());
        log.info(roleA.toString());
        roleA.attackBehavior.attack();
        roleA.defendBehavior.defend();
        roleA.displayBehavior.display();
        roleA.runBehavior.run();
    }
}
