package com.dyj.pkg;
import java.util.Arrays;

//import java.util.Scanner;//只引入java.util包下的Scanner
//import java.util.*;//表示将java.util下的所有类都引入
public class import01 {
    public static void main(String[] args) {
        int[] arr = {-1,20,2,13,3};
        //比如对其进行排序
        //系统提供了相关的类，可以方便完成Arrays
        Arrays.sort(arr);
        for(int i = 0;i < arr.length;i++) {
            System.out.println(arr[i]);
        }
    }

    }
