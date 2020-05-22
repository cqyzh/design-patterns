package com.yzh.designpatterns.abstractFactory;

/**
 * @classname: Test
 * @desc: 抽象工厂模式--测试类
 *        在工厂方法模式中，每一个具体的工厂都只对应生产一种具体的产品。但是有时候，我们需要一个工厂生产
 *        多个产品。
 *        概念：（1）、产品等级结构（产品的继承结构）：如一个抽象类是电视机，其子类有海尔电视机、海信电视机、TCL电视机，
 *                    则抽象的电视机和具体的品牌电视机之间就构成了一个产品等级结构，抽象电视机是父类，而具体品牌的电视机是其子类。
 *              （2）、产品族：在抽象工厂模式中，产品族是指由同一个工厂生产的，位于不同产品等级结构中的一组产品，如：海尔电器工厂
 *                    生产的海尔电视机、海尔冰箱、海尔空调，海尔电视机位于电视机产品等级结构中，海尔冰箱位于冰箱产品等结构中。
 *         当系统所提供的工厂所需生产的具体产品并不是一个简单的对象，而是多个位于不同产品等级结构（电视机、电冰箱等）中属于不同类型的具体产品（同一产品族）
 *         时就需要用到抽像工厂模式。
 * @author: YZ
 * @date: 2020/5/20 15:11
 * @version: 1.0
 **/
public class Test {

    public static void main(String[] args) {
        CourseFactory javaCourseFactory = new JavaCourseFactory();
        javaCourseFactory.createVideo().produce();
        javaCourseFactory.createArticle().produce();


        CourseFactory pythonCourseFactory = new PythonCourseFactory();
        pythonCourseFactory.createVideo().produce();
        pythonCourseFactory.createArticle().produce();

    }
}
