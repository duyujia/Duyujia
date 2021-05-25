package com.dyj.pkg.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 *该类是完成零钱通的各个功能的类
 *使用OOP(面向对象编程)
 * 将各个功能对应于一个方法
 */
public class SmallChangeSysOOP {
    boolean loop = true;//loop控制循环菜单
    Scanner scanner = new Scanner(System.in);
    String key = "";
    //2.	完成零钱通明细,可使用以下方法
    //(1)可以把收益入账和消费，保存到数组
    //(2)可以使用对象
    //(3)简单的方法可以使用String拼接
    String details = "==============零钱通明细=================";

    //3.	完成收益入账 完成功能驱动增加新的变化和代码
    //定义新的变量
    double money = 0;
    double balance = 0;
    Date date = null;//date是java.util.Date类型，表示日期
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");//可以用于日期格式化

    //4.	消费
    //定义新变量，保存消费的原因
    String note = "";

    //先完成显示菜单，并可以选择
    public void mainMenu() {
        do{
            System.out.println("\n==========选择零钱通菜单==============");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退出");

            System.out.println("请选择(1-4):");
            key = scanner.next();

            //使用switch分支控制
            switch (key) {
                case "1":
                    this.detail();
                    break;

                case "2":
                    this.income();
                    break;

                case "3":
                    this.pay();
                    break;

                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("输入有误，请重新选择");
                    break;
            }


        }while (loop);
    }

    //完成零钱通明细
    public void detail() {
        System.out.println(details);

    }

    //完成收益入账
    public void income() {
        System.out.println("2 收益入账金额");
        money = scanner.nextDouble();
        //money的值应该校验
        //编程思想；尽量找不正确的条件判断而不是正确的条件判断
        //找出不正确金额的条件，然后给出提示，直接break
        if(money <= 0) {
            System.out.println("收益入账金额需要>0");
            return;//退出方法，不再执行后面的代码
        }
        balance += money;
        //拼接收益入账信息到details
        //得到时间
        date = new Date();//获取当前日期
        details +="\n收益入账\t + " + money + "\t" + sdf.format(date) + "\t" +balance;
    }

    public void pay() {
        System.out.print("3 消费金额：");
        money = scanner.nextDouble();
        if(money <=0 || money > balance) {
            System.out.println("消费金额应该在“0-" + balance);
        }
        //money的值应该校验
        //编程思想；尽量找不正确的条件判断而不是正确的条件判断
        //找出不正确金额的条件，然后给出提示，直接break
        System.out.print("消费说明：");
        note = scanner.next();
        balance -= money;
        date = new Date();
        details +="\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" +balance;
    }

    //退出
    public void exit() {
        //6.用户输入4时，给出提示”你确定要退出吗？y/n”,必须输入正确的y/n,否则循环输入指令，直到输入y/n
        //(1)定义一个变量choice,接收用户收入
        //(2)使用while + break,来处理接收到的输入y/n
        //(3)当用户退出while后，再进行判断choice是y还是n,就可以决定是否退出
        //(4)建议一段代码，完成一个小功能，尽量不要混在一起
        String choice = "";
        //此while + break,用来处理接收到的输入必须是y/n，否则就一直循环
        while(true) {
            System.out.println("你确定要退出吗？y/n");
            choice = scanner.next();
            if("y".equals(choice) || "n".equals(choice)) {
                break;
            }
        }
        //当用户退出while后，进行判断
        if(choice.equals("y")) {
            loop = false;
            System.out.println("4 退出");
        }
    }
}
