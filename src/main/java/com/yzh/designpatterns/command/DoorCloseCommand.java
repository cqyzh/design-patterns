package com.yzh.designpatterns.command;

/**
 * @classname: DoorCloseCommand
 * @desc: 关门的命令
 * @author: YZ
 * @date: 2020/5/22 14:30
 * @version: 1.0
 **/
public class DoorCloseCommand implements Command{
    private Door door;

    public DoorCloseCommand(Door door){
        this.door = door;
    }

    @Override
    public void execute() {
        door.close();
    }
}
