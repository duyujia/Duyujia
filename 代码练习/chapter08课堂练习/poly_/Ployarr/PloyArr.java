package com.dyj.pkg.poly_.Ployarr;

public class PloyArr {
      public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0] = new Person("jack",20);
        persons[1] = new Student("Marry",18,100);
        persons[2] = new Student("smith",19,30);
        persons[3] = new Teacher("scott",30,20000);
        persons[4] = new Teacher("king",32,26000);

        //循环遍历数组，调用say
        for(int i = 0;i < persons.length;i++) {
            //persons[i]编译类型是Person，运行类型是根据实际情况由JVM来判断
            System.out.println(persons[i].say());//动态绑定机制
            if(persons[i] instanceof Student) {
                //这里判断persons[i]的运行类型是不是Student
                Student student = (Student)persons[i];
                student.study();
                //也可写成((Student)person[i]).study;
            } else if(persons[i] instanceof Teacher) {
                ((Teacher) persons[i]).teach();
            } else if(persons[i] instanceof Person) {

            }else {
                System.out.println("你的类型有误，请自己检查");
            }
        }
    }
}
