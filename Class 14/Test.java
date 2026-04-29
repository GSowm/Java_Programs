class Parent {
    public void m1(){
        System.out.println("Parent class:m1()");
    }
    public void m2(){
        System.out.println("Parent class:m2()");
    }
}
class Child extends Parent{
    public void m3(){
        System.out.println("Child class:m3()");
    }
}
public class Test{
    public static void main(String[] args) {
        Parent p1 = new Parent();
        Child c1 = new Child();
        Parent c2 = new Parent();
        p1.m1();
        p1.m2();
        c1.m1();
        c1.m2();
        c1.m3();
        c2.m1();
        c2.m2();
    }
}