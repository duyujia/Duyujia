1.下面数组定义正确的有
A.String strs[] = {'a','b','c'};//error,char->String
B.String strs[] = {"a","b","c"};//ok
C.String strs[] = new String{"a","b","c"};//error，可写成String strs[] = {"a","b","c"};
D.String strs[] = new String[]{"a","b","c"};//ok
E.String strs[] = new String[3]{"a","b","c"};//error,不用写3

2.
String foo = "blue";
boolean[] bar = new boolean[2];//bar数组元素默认false
if(bar[0]) {
	foo = "green";
}
System.out.println(foo);//blue

3.
int num = 1;
while(num < 10) {
	System.out.println(num);//1,3,5,7
	if(num > 5) {
		break;
	}
	num += 2;
}