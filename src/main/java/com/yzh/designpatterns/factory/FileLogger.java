package com.yzh.designpatterns.factory;

import lombok.extern.slf4j.Slf4j;

/**
 * @classname: FileLogger
 * @desc: TODO
 * @author: YZ
 * @date: 2020/5/20 14:44
 * @version: 1.0
 **/
@Slf4j
public class FileLogger implements Logger {
    @Override
    public void writeLog(String message) {
      log.info("这是文件日志基类器："+message);
    }
}
