abstract class Abstract_example {
    public abstract void pay(double amount);    
}

class Upi extends Abstract_example{
    public void pay(double amount){
        System.out.println("UPI Payment Amount:"+amount);
    }
}

class CC extends Abstract_example{
    public void pay(double amount){
        System.out.println("CC Payment Amount:"+amount);
    }
}

class Demo{
    public static void main(String[] args) {
        Upi u1 = new Upi();
        u1.pay(5000.50);

        CC c1 = new CC();
        c1.pay(15000.50);
    }
}