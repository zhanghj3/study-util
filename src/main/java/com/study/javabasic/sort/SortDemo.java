package com.study.javabasic.sort;

import org.junit.Test;

import java.util.Arrays;

public class SortDemo {

    /**
     * 使用Arrays.sort()进行排序
     */
    @Test
    public void test1(){
        int[] arr = {42,24,23,7,87,22,76};
        Arrays.sort(arr);
        printString(arr);
    }

    /**
     * 冒泡排序
     */
    @Test
    public void test2(){
        int[] arr = {42,24,23,7,87,22,76};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int temp = arr[i];
                if(arr[i] < arr[j]){
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        printString(arr);
    }

    /**
     * 插入排序
     */
    @Test
    public void test3(){
        int[] arr = {42,24,23,7,87,22,76};
        for(int i=0;i<arr.length-1;i++){
            int j=i+1;
            while(arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                if(j>1){
                    j--;
                }
            }
        }
        printString(arr);
    }

    /**
     * 选择排序
     */
    @Test
    public void test4(){
        int[] arr = {42,24,23,7,87,22,76};
        for(int i=0;i<arr.length-1;i++){
            int temp = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<=arr[temp]){
                    temp = j;
                }
            }
            //找出最小的下标
            if(temp!=i){
                int tempVal = arr[i];
                arr[i] = arr[temp];
                arr[temp] = tempVal;
            }
        }
        printString(arr);
    }

    /**
     * 快速排序
     */
    @Test
    public void test5(){ int[] arr = {42,24,23,7,87,22,76,324,2342,2,234,42,34,2324,4,534,53,3,54};
        int[] oriArr = Arrays.copyOf(arr,arr.length);
        quciksort(arr,0,arr.length-1,oriArr);
        printString(oriArr);
    }


    public void printString(int[] arr){
        for(int a : arr){
            System.out.print(a + " ");
        }
    }

    public void quciksort(int[] arr, int oriBegin, int oriEnd, int[] oriArr){
        int pointVal = arr[0];
        int begin = oriBegin;
        int end = oriEnd;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>pointVal){
                oriArr[end] = arr[i];
                end--;
            }else{
                oriArr[begin] = arr[i];
                begin++;
            }
        }
        arr = null;
        int pointIndex = begin;
        oriArr[pointIndex] = pointVal;
        if(begin-oriBegin>1){
            quciksort(Arrays.copyOfRange(oriArr,oriBegin,begin),oriBegin,begin-1,oriArr);
        }
        if(oriEnd-end>1){
            quciksort(Arrays.copyOfRange(oriArr,end+1,oriEnd+1),end+1,oriEnd,oriArr);
        }
    }

}
