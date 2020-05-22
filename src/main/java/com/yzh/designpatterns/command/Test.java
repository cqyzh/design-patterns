package com.yzh.designpatterns.command;

/**
 * @classname: Test
 * @desc: 测试类
 * @author: YZ
 * @date: 2020/5/22 14:31
 * @version: 1.0
 **/
public class Test {

    public static void main(String[] args) {
        ControlPanel controlPanel = new ControlPanel();

        Door door = new Door();
        Light light = new Light();

        //设置命令
        controlPanel.setCommand(0,new DoorOpenCommand(door));
        controlPanel.setCommand(1,new DoorCloseCommand(door));

        controlPanel.setCommand(2,new LightOnCommand(light));
        controlPanel.setCommand(3,new LightOffCommand(light));

        //点击按钮
        controlPanel.keyPressed(0);
        controlPanel.keyPressed(1);
        controlPanel.keyPressed(2);
        controlPanel.keyPressed(3);
    }
}
