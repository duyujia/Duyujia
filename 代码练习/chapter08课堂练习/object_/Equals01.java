package com.dyj.pkg.object_;

public class Equals01 {
    public static void main(String[] args) {

    //equals方法查看源代码：把光标放在equals方法，直接输入ctrl+b
        "hello".equals("abd");
        /*
        //String类的equals方法
        //把Object的equals方法重写了，变成了比较两个字符串值是否相同
        public boolean equals(Object anObject) {
        if (this == anObject) {
            return true;
        }
        if (anObject instanceof String) {//判断类型
            String anotherString = (String)anObject;//向下转型
            int n = value.length;
            if (n == anotherString.value.length) {//长度相同
                char v1[] = value;
                char v2[] = anotherString.value;
                int i = 0;
                while (n-- != 0) {
                    if (v1[i] != v2[i])
                        return false;
                    i++;
                }
                return true;//如果两个字符串的所有字符都相同，则返回true
            }
        }
        return false;//如果比较的不是字符串，则直接返回false
    }
        //看看Object的equals
        //即Object的equals方法默认就是比较对象地址是否相同，也就是判断两个对象是不是同一个对象
        public boolean equals(Object obj) {
        return (this == obj);
    }

        Integer integer = new Integer(5)
        //从源码看看Integer的equals
        //Integer也重写了Object的equals方法，变成了判断两个值是否相等
        public boolean equals(Object obj) {
        if (obj instanceof Integer) {
            return value == ((Integer)obj).intValue();
        }
        return false;
    }



         */
    }

}
