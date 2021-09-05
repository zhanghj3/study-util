package com.study.javabasic.desginmode.singletonmode;

/**
 * 单例模式-懒汉模式（第一次调用时创建对象）
 */
public class Singleton {


    /**
     * 1.定义静态变量
     */
    private static Singleton singleton;
    /**
     * 2.私有化构造方法
     */
    private Singleton(){
    }

    /**
     * 3.开放共有方法供外界获取对象
     * @return
     */
    public static Singleton newInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
