/**
 * @auther dyj
 */
public class homework05 {
    public static void main(String[] args) {
        A a = new A();
        a.f1();

    }
}
 class A{
    private String NAME ="Name";
    public void f1(){
         class B{
             private final String NAME = "name";
             private void show(){
                 System.out.println(NAME+"\t"+A.this.NAME);//内外部类属性重名，可用外部类.this.属性名来访问外部类
             }
         }
        B b = new B();
         b.show();

    }

 }
