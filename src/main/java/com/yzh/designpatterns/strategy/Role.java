package com.yzh.designpatterns.strategy;

/**
 * @classname: Role
 * @desc: 策略模式--角色的超类
 * @author: YZ
 * @date: 2020/5/22 9:57
 * @version: 1.0
 **/
public abstract class Role {

    protected String name;

    protected IRunBehavior runBehavior;

    protected IAttackBehavior attackBehavior;

    protected IDefendBehavior defendBehavior;

    protected IDisplayBehavior displayBehavior;

    /**
     * 设置攻击方式
     * @param attackBehavior
     * @return
     */
    public Role setAttackBehavior(IAttackBehavior attackBehavior){
        this.attackBehavior = attackBehavior;
        return this;
    }

    /**
     *设置逃跑方式
     * @param runBehavior
     * @return
     */
    public Role setRunBehavior(IRunBehavior runBehavior) {
        this.runBehavior = runBehavior;
        return this;
    }

    /**
     * 设置防御方式
     * @param defendBehavior
     * @return
     */
    public Role setDefendBehavior(IDefendBehavior defendBehavior) {
        this.defendBehavior = defendBehavior;
        return this;
    }

    /**
     * 设置着装
     * @param displayBehavior
     * @return
     */
    public Role setDisplayBehavior(IDisplayBehavior displayBehavior) {
        this.displayBehavior = displayBehavior;
        return this;
    }
}
