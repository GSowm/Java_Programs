public class Test_constructor {
    Test_constructor(){
        System.out.println("Test class constructor");
    }
    public void m1(){
        System.out.println("m1 method");
    }
    public static void main(String[] args) {
        Test_constructor t1 = new Test_constructor();
        Test_constructor t2 = new Test_constructor();
        t1.m1();;
        t1.m1();
        t2.m1();
     }
}
