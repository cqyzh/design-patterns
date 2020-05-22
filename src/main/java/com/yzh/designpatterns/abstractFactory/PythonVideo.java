package com.yzh.designpatterns.abstractFactory;

import lombok.extern.slf4j.Slf4j;

/**
 * @classname: PythonVideo
 * @desc: 抽象工厂模式--具体产品：它定义具体工厂生产的具体产品对象，实现抽象产品接口中声明的业务方法。
 * @author: YZ
 * @date: 2020/5/20 17:00
 * @version: 1.0
 **/
@Slf4j
public class PythonVideo implements Video {
    @Override
    public void produce() {
        log.info("python录制视频");
    }
}
