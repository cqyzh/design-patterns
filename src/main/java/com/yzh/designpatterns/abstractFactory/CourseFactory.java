package com.yzh.designpatterns.abstractFactory;

/**
 * @classname: CourseFactory
 * @desc: 抽象工厂模式--抽象工厂:它声明了一组用于创建一种产品的方法，每一个方法对应一种产品，如创建视频和创建手记。
 * @author: YZ
 * @date: 2020/5/20 16:53
 * @version: 1.0
 **/
public interface CourseFactory {

    Video createVideo();

    Article createArticle();
}
