package com.dyj.pkg.HouseRent.Service;

import com.dyj.pkg.HouseRent.domain.House;

import javax.jws.soap.SOAPMessageHandlers;

public class HouseService {

    private House[] houses;//保存House对象
    private int houseNums = 1;//记录当前有多少个房屋信息
    private int idCounter = 1;//记录当前id增长到那个值

    public HouseService(int size) {
        //new houses
        houses = new House[size];//当创建HouseService对象，指定数组大小
        //为了配合测试列表信息，这里初始化House对象
        houses[0] = new House(1, "jack", "112", "海淀区", 2000, "未出租");
    }

    //findById方法，返回House对象或null
    public House findById(int findId) {
        //遍历数组
        for(int i = 0;i < houseNums;i++) {
            if(findId == houses[i].getId()) {
                return houses[i];
            }
        }
        return null;
    }

    //del方法，删除一个房屋信息
    public boolean del(int delId) {

        //应当先找到要删除的房屋信息对应的下标
        //一定要搞清楚下标和房屋的编号不是一回事
        int index = -1;
        for (int i = 0; i < houseNums; i++) {
            if (delId == houses[i].getId()) {//要删除的房屋(Id),是数组下表为i的元素
                index = i;//就使用index记录i
            }
        }

        if (index == -1) {//说明delId在数组中不存在
            return false;
        }

        for(int i = index;i < houseNums-1;i++) {
            houses[i] = houses[i+1];
        }
        houses[--houseNums] = null;//把当前存在的房屋信息的最后一个置空
        return true;
    }


    public boolean add(House newHouse) {
        //判断是否还可以继续添加(暂时不考虑数组扩容的问题)
        if(houseNums == houses.length) {
            System.out.println("数组已满，不能再添加了..");
            return false;
        }
        //把newHouse对象加入到houses数组
        houses[houseNums] = newHouse;
        houseNums++;
        //上面两句话可以写成 houses[houseNums++] = newHouse;
        //设计一个id自增长机制，然后更新newHouse的id
        newHouse.setId(++idCounter);
        return true;

    }

    //list方法，返回houses
    public House[] list() {
        return houses;
    }
}
