package com.yzh.designpatterns.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * @classname: Role_1
 * @desc: 策略模式--具体的角色
 * @author: YZ
 * @date: 2020/5/22 10:02
 * @version: 1.0
 **/
@Slf4j
public class RoleA extends Role {

    public RoleA(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "我的角色名子是："+this.name;
    }
}
