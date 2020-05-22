package com.yzh.designpatterns.command;

/**
 * @classname: LightCloseCommand
 * @desc: TODO
 * @author: YZ
 * @date: 2020/5/22 15:07
 * @version: 1.0
 **/
public class LightOffCommand implements Command{

    private Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
