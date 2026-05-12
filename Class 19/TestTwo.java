public class TestTwo {
    public static void main(String[] args) {
        int a=100;
        //Integer b=Integer.valueOf(a);
        Integer b=a; //Auto Boxing - Primitive to Object type
        System.out.println(a);
        System.out.println(b);
        
        int c=b;//Unboxing - Object to Primitive
        //int c=b.intValue();
        System.out.println(c);
    }
}