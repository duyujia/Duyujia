import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        Mytools mt = new Mytools();
        int[] arr = {10, -1, 8, 0, 34};
        Scanner scanner1 = new Scanner(System.in);

        mt.bubble(arr);
        //输出排序后的arr
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
//查看类的继承关系
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

//创建一个类Mytools,编写一个方法，可以完成对int数组冒泡排序功能
class Mytools {
    public void bubble(int[] arr) {
        //冒泡排序
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
