package com.yzh.designpatterns.abstractFactory;

/**
 * @classname: JavaCourseFactory
 * @desc: 抽象工厂模式--具体工厂：它实现了在抽象工厂中定义的创建产品的方法，生成一组具体产品，这些产品构成了一个产品族，每一个产品都位于某个产品等级结构中。
 * @author: YZ
 * @date: 2020/5/20 16:56
 * @version: 1.0
 **/
public class JavaCourseFactory implements CourseFactory{


    @Override
    public Video createVideo() {
        return new JavaVideo();
    }

    @Override
    public Article createArticle() {
        return new JavaArticle();
    }
}
