package com.yzh.designpatterns.command;

/**
 * @classname: NoCommand
 * @desc: 无任何操作命令（空操作）
 * @author: YZ
 * @date: 2020/5/22 14:50
 * @version: 1.0
 **/
public class NoCommand implements Command{
    @Override
    public void execute() {
        //空操作
    }
}
