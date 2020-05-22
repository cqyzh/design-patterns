package com.yzh.designpatterns.strategy;

/**
 * @classname: IDefendBehavior
 * @desc: 策略模式--将变化的抽取出来（每个角色的防御方式可能不一样）
 * @author: YZ
 * @date: 2020/5/22 10:11
 * @version: 1.0
 **/
public interface IDefendBehavior {
    void defend();
}
