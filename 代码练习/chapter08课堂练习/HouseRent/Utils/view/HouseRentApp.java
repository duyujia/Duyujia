package com.dyj.pkg.HouseRent.Utils.view;

public class HouseRentApp {
    public static void main(String[] args) {

        //创建HouseView对象，并且显示主菜单，是整个程序的入口
        new HouseView().mainMenu();
        //也可写成
//        HouseView houseView = new HouseView();
//        houseView.mainMenu();
        System.out.println("========你退出房屋出租系统=============");
    }
}
