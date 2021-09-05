package com.study.javabasic.desginmode.factorymode;

/**
 * 剪左偏分发型
 */
public class LeftHair implements HairInterface {
    @Override
    public void cut() {
        System.out.println("------------剪了一个左偏分的发型------------");
    }
}
