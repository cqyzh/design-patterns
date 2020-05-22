package com.yzh.designpatterns.command;

/**
 * @classname: LightOnCommand
 * @desc: 开灯的命令
 * @author: YZ
 * @date: 2020/5/22 15:05
 * @version: 1.0
 **/
public class LightOnCommand implements Command{

    private Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.on();
    }
}
