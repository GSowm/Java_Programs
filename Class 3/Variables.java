public class Variables{
    int a = 10;
    int b= 20;
    static int c = 30;
    
    public static void main(String[] args){
        System.out.println(c);
        System.out.println(Variables.c);
        Variables v1 = new Variables();
        System.out.println(v1.c);
    }
}