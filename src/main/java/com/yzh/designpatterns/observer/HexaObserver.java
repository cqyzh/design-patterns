package com.yzh.designpatterns.observer;

import lombok.extern.slf4j.Slf4j;

/**
 * @classname: HexaObserver
 * @desc: TODO
 * @author: YZ
 * @date: 2020/5/15 14:35
 * @version: 1.0
 **/
@Slf4j
public class HexaObserver extends Observer {

    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.addObserver(this);
    }

    @Override
    public void update() {
        log.info("Hexa String:"+Integer.toHexString(this.subject.getState()));
    }
}
