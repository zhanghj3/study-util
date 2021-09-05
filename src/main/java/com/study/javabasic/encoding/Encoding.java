package com.study.javabasic.encoding;

import org.junit.Test;

import java.io.UnsupportedEncodingException;

public class Encoding {

    /**
     * 将字符串转换成字节数组，打印输出
     */
    @Test
    public void test1(){
        String str = "张华健ABC";
        // 不指定字符集就默认使用项目的字符集
        byte[] bb = str.getBytes();
        for(byte b : bb){
            // 一个字节是8位二进制 比如 01010101 转成16进制是两位 比如e5
            // & 按位与 都为1才为1，否则为0  010&011=010
            // 0xff 转化成二进制就是 11111111
            // b & 0xff：打印字节b的16进制
            System.out.print(Integer.toHexString(b & 0xff) + " ");
        }
        // getBytes()和newString()的时候都不指定编码方式，就默认使用工程编码
        String newStr = new String(bb);
        System.out.println(newStr);
    }

    /**
     * gbk格式，1个中文占2个字节，字母占1个字节
     */
    @Test
    public void test2() throws UnsupportedEncodingException {
        String str = "张华健ABC";
        byte[] bb = str.getBytes("gbk");
        for(byte b : bb){

            System.out.print(Integer.toHexString(b & 0xff) + " ");
        }
        String newStr = new String(bb,"gbk");
        System.out.println(newStr);
    }

    /**
     * utf-8格式，1个中文占3个字节，字母占1个字节
     */
    @Test
    public void test3() throws UnsupportedEncodingException {
        String str = "张华健ABC";
        byte[] bb = str.getBytes("utf-8");
        for(byte b : bb){

            System.out.print(Integer.toHexString(b & 0xff) + " ");
        }
        String newStr = new String(bb,"utf-8");
        System.out.println(newStr);
    }


    /**
     * 将字符数组转成String
     * @throws UnsupportedEncodingException
     */
    @Test
    public void test4() throws UnsupportedEncodingException {
        String str = "e5 bc a0 e5 8d 8e e5 81 a5 41 42 43";
        String[] strArr = str.split(" ");
        byte[] bb = new byte[strArr.length];
        for(int i=0;i<strArr.length;i++){
            byte b = (byte)Integer.parseInt(strArr[i],16);
            bb[i] = b;
        }
        System.out.println(new String(bb,"utf-8"));
    }
}
