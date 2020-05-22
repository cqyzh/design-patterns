package com.yzh.designpatterns.abstractFactory;

/**
 * @classname: PythonCourseFactory
 * @desc: 抽象工厂模式--具体工厂：它实现了在抽象工厂中定义的创建产品的方法，生成一组具体产品，这些产品构成了一个产品族，每一个产品都位于某个产品等级结构中。
 * @author: YZ
 * @date: 2020/5/20 17:03
 * @version: 1.0
 **/

public class PythonCourseFactory implements CourseFactory{
    @Override
    public Video createVideo() {
        return new PythonVideo();
    }

    @Override
    public Article createArticle() {
        return new PythonArticle();
    }
}
