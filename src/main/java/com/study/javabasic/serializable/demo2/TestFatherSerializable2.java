package com.study.javabasic.serializable.demo2;

import java.io.*;
import java.util.ArrayList;

public class TestFatherSerializable2 {

    /**
     * 3.如果父类如果没有实现Serializable接口，则反序列化子类的时候会调用父类的无参构造方法
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception{
        Son2 son = new Son2();
        // 当前user.dir=study-util文件夹，所以生成的文件是相对与study-util而言的
        String filePath = "file/student2.dat";
        // 序列化
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));
        oos.writeObject(son);
        oos.flush();
        oos.close();
        // 反序列化
        ObjectInputStream osi = new ObjectInputStream(new FileInputStream(filePath));
        Son2 s = (Son2)osi.readObject();
        System.out.println(s);
        new ArrayList();
        osi.close();
    }
}


class Father2{
    Father2(){
        System.out.println("Father2...");
    }
}

class Son2 extends Father2 implements Serializable{
    Son2(){
        System.out.println("Son2...");
    }
}