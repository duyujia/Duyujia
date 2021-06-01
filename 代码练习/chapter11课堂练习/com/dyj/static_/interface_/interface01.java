package com.dyj.static_.interface_;

public class interface01 {
    public static void main(String[] args) {
        //创建手机、相机对象
        Camera camera = new Camera();
        Phone phone = new Phone();
        //创建计算机
        Computer computer = new Computer();

        //把手机接入到计算机
        computer.work(phone);
        System.out.println("==================================");

        //把相机接入到计算机
        computer.work(camera);
    }
}

//phone类实现 UsbInterface
//1.phone类需要实现UsbInterface接口规定/声明的方法
class Phone implements UsbInterface{//实现接口，就是把接口的方法实现
    @Override
    public void start() {
        System.out.println("手机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("手机停止工作");
    }
}

class Camera implements UsbInterface{//实现接口
    @Override
    public void start() {
        System.out.println("相机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("相机停止工作");
    }
}

class Computer{
    //编写一个方法
    //1. UsbInterface usbInterface 形参是接口类型UsbInterface
    //2. 看到usbInterface接收/实现了UsbInterface接口的类的对象实例
    public void work(UsbInterface usbInterface) {
        //通过接口来调用方法
        usbInterface.start();
        usbInterface.stop();
    }
}