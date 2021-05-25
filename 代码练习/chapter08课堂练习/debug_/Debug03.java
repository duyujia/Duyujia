package com.dyj.pkg.debug_;

import java.util.Arrays;

public class Debug03 {
    public static void main(String[] args) {
        int[] arr = {1,-1,10,-20,100};
        //查看Arrays.sort()方法的底层实现
        Arrays.sort(arr);
        for(int i = 0;i < arr.length;i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
