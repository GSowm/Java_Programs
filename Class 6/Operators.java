public class Operators {

public void method1(){
    int i=1;
    int j=i++;

    System.out.println(i);
    System.out.println(j);
}
    public static void main(String[] args) {
        int i = 1;
        int j = ++i;

        System.out.println(i);
        System.out.println(j);

        Operators o1 = new Operators();
        o1.method1();
    }

}
