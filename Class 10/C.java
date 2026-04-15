package pack2;
import pack1.A;
public class C extends A{
    public void m2(){
        System.out.println("Public class C-public method m2()");
    }

    public static void main(String[] args) {
        A a2 = new A();
        //a2.m1();

        C c1 = new C();
        c1.m1();
        c1.m2();
    }
}
