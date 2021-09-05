package com.study.javabasic.serializable.demo1;

import java.io.Serializable;


public class Student implements Serializable {
    /**
     * serialVersionUID 这个相当与序列话和反序列化的一个key
     * 如果序列化的对象和反序列话的对象key不一样，那么反序列化
     * 的时候会抛异常
     */
    private static final long serialVersionUID = 1L;
    private String name;
    private transient int age;
    private String sex;

    public Student(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    private void writeObject(java.io.ObjectOutputStream s) throws java.io.IOException, ClassNotFoundException {
        // 把jvm能默认序列化的元素进行序列化
        s.defaultWriteObject();
        // 自己完成age的序列化
        s.writeInt(age);
    }

    private void readObject(java.io.ObjectInputStream s) throws java.io.IOException, ClassNotFoundException {
        // 把jvm能默认完成反序列化的元素进行反序列化
        s.defaultReadObject();
        // 自己完成age的反序列化
        this.age = s.readInt();
    }

}
