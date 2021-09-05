package com.study.javabasic.desginmode.factorymode;

/**
 * 剪右偏分发型
 */
public class RightHair implements HairInterface {
    @Override
    public void cut() {
        System.out.println("------------剪了一个右偏分的发型------------");
    }
}
