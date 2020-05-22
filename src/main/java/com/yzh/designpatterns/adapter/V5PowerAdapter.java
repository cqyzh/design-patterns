package com.yzh.designpatterns.adapter;

import lombok.extern.slf4j.Slf4j;

/**
 * @classname: V5PowerAdapter
 * @desc: 适配器模式--将指定的电压降低到5v
 * @author: YZ
 * @date: 2020/5/22 13:48
 * @version: 1.0
 **/
@Slf4j
public class V5PowerAdapter implements V5Power{

    private V220Power v220Power;

    public V5PowerAdapter(V220Power v220Power){
        this.v220Power = v220Power;
    }

    @Override
    public int provider5V() {
        v220Power.provideV220Power();
        log.info("经过一系列的降压等操作，适配器将电压降到了5v");
        return 5;
    }
}
