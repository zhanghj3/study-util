package com.study.javabasic.desginmode.singletonmode;

public class TestDemo {
    public static void main(String[] args) {
        // 懒汉模式创建对象，并且比较他们是否是同一个对象
        Singleton s1 = Singleton.newInstance();
        Singleton s2 = Singleton.newInstance();
        System.out.println(s1 == s2);
        // 饿汉模式创建对象，并且比较他们是否是同一个对象
        Singleton2 s3 = Singleton2.newInstance();
        Singleton2 s4 = Singleton2.newInstance();
        System.out.println(s3 == s4);

    }
}
