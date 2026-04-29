public class Demo {
    public static void main(String[] args) {
        SA sa = new SA(101, "Rahul", "rg@gmail.com", "Bang", 5000.50);
        CA ca = new CA(102, "Sonia", "sg@gmail.com", "Hyd", 3000.50);
        sa.setMin_Bal(500);
        ca.setMin_Bal(1000);
        AccountService.getService(sa);
        AccountService.getService(ca);
    }
}