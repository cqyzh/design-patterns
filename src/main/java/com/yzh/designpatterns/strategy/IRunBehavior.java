package com.yzh.designpatterns.strategy;

/**
 * @classname: IRunBehavior
 * @desc: 策略模式--将变化的抽取出来（每个角色的逃跑方式可能不一样）
 * @author: YZ
 * @date: 2020/5/22 10:13
 * @version: 1.0
 **/
public interface IRunBehavior {

    void run();
}
