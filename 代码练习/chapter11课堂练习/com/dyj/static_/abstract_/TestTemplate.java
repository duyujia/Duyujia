package com.dyj.static_.abstract_;

public class TestTemplate {
    public static void main(String[] args) {
        AA aa = new AA();
        //aa.job();
        aa.calculateTime();

        BB bb = new BB();
        //bb.job();
        bb.calculateTime();

    }
}

class AA extends Template{
//    public void calculateTime(){
//        //得到开始的时间
//        long start = System.currentTimeMillis();
//        job();
//        //得到结束的时间
//        long end = System.currentTimeMillis();
//        System.out.println("执行时间" + (end-start));
//
//    }
    //计算任务
    public void job(){
        long num = 0;
        for (long i = 0; i <= 1000000; i++) {
            num += i;
        }

    }
//    public void job(){
//
//        //得到开始的时间
//        long start = System.currentTimeMillis();
//        long num = 0;
//        for (long i = 0; i <= 1000000; i++) {
//            num += i;
//        }
//        //得到结束的时间
//        long end = System.currentTimeMillis();
//        System.out.println("执行时间" + (end-start));
//    }
}

class BB extends Template{
//    public void calculateTime(){
//        //得到开始的时间
//        long start = System.currentTimeMillis();
//        job();
//        //得到结束的时间
//        long end = System.currentTimeMillis();
//        System.out.println("执行时间" + (end-start));
//    }

    public void job(){
        long num = 0;
        for (long i = 0; i <= 100000; i++) {
            num *= i;
        }
    }

//    public void job(){
//        //得到开始的时间
//        long start = System.currentTimeMillis();
//        long num = 0;
//        for (long i = 0; i <= 100000; i++) {
//            num *= i;
//        }
//        //得到结束的时间
//        long end = System.currentTimeMillis();
//        System.out.println("执行时间" + (end-start));
    }