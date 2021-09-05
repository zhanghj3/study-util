package com.study.javabasic.desginmode.singletonmode;

/**
 * 单例模式-饿汉模式（类加载时就创建对象）
 */
public class Singleton2 {


    /**
     * 1.定义静态变量
     */
    private static Singleton2 singleton = new Singleton2();
    /**
     * 2.私有化构造方法
     */
    private Singleton2(){
    }

    /**
     * 3.开放共有方法供外界获取对象
     * @return
     */
    public static Singleton2 newInstance(){
        return singleton;
    }
}
