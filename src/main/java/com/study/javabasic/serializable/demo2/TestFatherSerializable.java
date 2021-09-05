package com.study.javabasic.serializable.demo2;

import java.io.*;
import java.util.ArrayList;

public class TestFatherSerializable {

    /**
     * 1.父类如果实现了Serializable接口，那么子类也可以序列化和反序列化
     * 2.如果父类如果实现了Serializable接口，则反序列化子类的时候不调用父类的无参构造方法
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception{
        Son son = new Son();
        // 当前user.dir=study-util文件夹，所以生成的文件是相对与study-util而言的
        String filePath = "file/student2.dat";
        // 序列化
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));
        oos.writeObject(son);
        oos.flush();
        oos.close();
        // 反序列化
        ObjectInputStream osi = new ObjectInputStream(new FileInputStream(filePath));
        Son s = (Son)osi.readObject();
        System.out.println(s);
        new ArrayList();
        osi.close();
    }
}



class Father implements Serializable{
    Father(){
        System.out.println("Father...");
    }
}

class Son extends Father{
    Son(){
        System.out.println("Son...");
    }
}