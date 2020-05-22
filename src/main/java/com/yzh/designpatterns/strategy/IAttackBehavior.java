package com.yzh.designpatterns.strategy;

/**
 * @classname: IAttackBehavior
 * @desc: 策略模式--将变化的抽取出来（每个角色的攻击方式可能不一样）
 * @author: YZ
 * @date: 2020/5/22 10:10
 * @version: 1.0
 **/
public interface IAttackBehavior {

    void attack();
}
