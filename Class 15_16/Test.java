public class Test {
    public static void main(String[] args) {
        SA sa = new SA(101, "Rahul", "rg@gmail.com", "Bang", 5000.50);
        System.out.println("SA Oject");
        sa.setMin_Bal(500);
        sa.cal_Bal();
        System.out.println("After Depositing");
        sa.deposit(4000);
        sa.cal_Bal();

        CA ca = new CA(102, "Sonia", "sg@gmail.com", "Hyd", 3000.50);
        System.out.println("CA Object");
        ca.setMin_Bal(300);
        ca.cal_Bal();
        System.out.println("After Depositing");
        ca.deposit(2000);
        ca.cal_Bal();
    }
}
