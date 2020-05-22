package com.yzh.designpatterns.builder;

/**
 * @classname: Product
 * @desc: 建造者模式--具体产品
 * @author: YZ
 * @date: 2020/5/18 9:25
 * @version: 1.0
 **/
public class Product {

    private String buildA;

    private String buildB;

    private String buildC;

    public String getBuildA() {
        return buildA;
    }

    public void setBuildA(String buildA) {
        this.buildA = buildA;
    }

    public String getBuildB() {
        return buildB;
    }

    public void setBuildB(String buildB) {
        this.buildB = buildB;
    }

    public String getBuildC() {
        return buildC;
    }

    public void setBuildC(String buildC) {
        this.buildC = buildC;
    }

    @Override
    public String toString() {
        return "Product{" +
                "buildA='" + buildA + '\'' +
                ", buildB='" + buildB + '\'' +
                ", buildC='" + buildC + '\'' +
                '}';
    }
}
