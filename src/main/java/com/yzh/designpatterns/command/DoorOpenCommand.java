package com.yzh.designpatterns.command;

import lombok.extern.slf4j.Slf4j;

/**
 * @classname: DoorOpenCommand
 * @desc: 开门的命令
 * @author: YZ
 * @date: 2020/5/22 14:27
 * @version: 1.0
 **/
@Slf4j
public class DoorOpenCommand implements Command{

    private Door door;

    public DoorOpenCommand(Door door){
        this.door = door;
    }

    @Override
    public void execute() {
        door.open();
    }
}
