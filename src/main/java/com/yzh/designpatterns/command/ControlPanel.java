package com.yzh.designpatterns.command;

/**
 * @classname: ControlPanel
 * @desc: 控制器面板
 * @author: YZ
 * @date: 2020/5/22 14:48
 * @version: 1.0
 **/
public class ControlPanel {

    private Command[] commands;

    public ControlPanel(){
        commands = new Command[4];

        for (int i = 0; i < 4; i++) {
            commands[i] = new NoCommand();
        }
    }

    /**
     * 设置每个按钮对应的命令
     * @param index
     * @param command
     */
    public void setCommand(int index,Command command){
        commands[index] = command;
    }

    /**
     *模拟点击按钮
     * @param index
     */
    public void keyPressed(int index){
        commands[index].execute();
    }
}
