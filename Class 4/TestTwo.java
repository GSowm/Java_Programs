public class TestTwo {
    int a;
    static int b;

    public double get_Bal(){
        double min_Bal = 500.00;
        double acc_Bal = 1500.00;
        return acc_Bal-min_Bal;
    }
    public static void main(String[] args) {
        int c;
      //System.out.println(c);
       TestTwo t1 = new TestTwo();
       System.out.println(t1.get_Bal());
    }    
}
