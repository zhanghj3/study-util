package com.study.javabasic.serializable.demo1;


import org.junit.Test;

import java.io.*;
import java.util.ArrayList;

public class TestSerializable {


    /**
     * 序列化：将对象转成字节序列
     * 反序列化：将字节序列转换成对象
     * 对象必须实现Serializable接口，否则序列化抛异常
     */
    @Test
    public void test1() throws Exception {
        Student student = new Student("张华健",18,"男");
        // 当前user.dir=study-util文件夹，所以生成的文件是相对与study-util而言的
        String filePath = "file/student.dat";
        // 序列化
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));
        oos.writeObject(student);
        oos.flush();
        oos.close();
        // 反序列化
        ObjectInputStream osi = new ObjectInputStream(new FileInputStream(filePath));
        Student s = (Student)osi.readObject();
        System.out.println(s);
    }

    /**
     * 加上transient关键字，
     * 可以将对象的某个属性在序列化的时候变成默认值
     */
    @Test
    public void test2() throws Exception {
        Student student = new Student("张华健",18,"男");
        // 当前user.dir=study-util文件夹，所以生成的文件是相对与study-util而言的
        String filePath = "file/student1.dat";
        // 序列化
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));
        oos.writeObject(student);
        oos.flush();
        oos.close();
        // 反序列化
        ObjectInputStream osi = new ObjectInputStream(new FileInputStream(filePath));
        Student s = (Student)osi.readObject();
        System.out.println(s);
    }

    /**
     * 使用transient修饰属性后，可以参考ArrayList的序列化反序列化方法，给
     * 属性做一定的操作
     */
    @Test
    public void test3() throws Exception {
        Student student = new Student("张华健",18,"男");
        // 当前user.dir=study-util文件夹，所以生成的文件是相对与study-util而言的
        String filePath = "file/student2.dat";
        // 序列化
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));
        oos.writeObject(student);
        oos.flush();
        oos.close();
        // 反序列化
        ObjectInputStream osi = new ObjectInputStream(new FileInputStream(filePath));
        Student s = (Student)osi.readObject();
        System.out.println(s);
        new ArrayList();
        osi.close();
    }
}
