package com.study.javabasic.desginmode.factorymode;

public class TestDemo {
    public static void main(String[] args) {
        // 1.工厂模式，将对象实例化交给工厂，实现解耦
        // 2.如：spring的bean工厂、JDBC的创建
        HairInterface leftHair = HairFactory.makeHair("com.study.javabasic.desginmode.factorymode.LeftHair");
        leftHair.cut();
        HairInterface rightHair = HairFactory.makeHair("com.study.javabasic.desginmode.factorymode.RightHair");
        rightHair.cut();
    }
}
