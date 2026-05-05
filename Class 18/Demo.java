public class Demo {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        Integer i = 300;
        Emp e1 = new Emp();
        Emp e2 = new Emp();
        String s1 = "Rahul";
        String s2 = new String("Rahul");

        System.out.println(a==b);                   //false
        System.out.println(e1==e2);                //false

        System.out.println(s1.equals(s2));         //true

        System.out.println(e1.equals(e2));         //false

        System.out.println(s1==s2);               //false
    }
}
class Emp{
    public void m1(){
        System.out.println("Emp class - m1 method");
    }
}