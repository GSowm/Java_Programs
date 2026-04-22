interface Payment {
    public abstract void pay(double amount);
}

class CC implements Payment{
    public void pay(double amount){
        System.out.println("CC Payment amount:"+amount);
    }
}

class GPay implements Payment{
    public void pay(double amount){
        System.out.println("GPay Payment amount:"+amount);
    }
}

class FlipkartPay implements Payment{
    public void pay(double amount){
        System.out.println("FlipkartPay Payment amount:"+amount);
    }
}

class Test{
    public static void main(String[] args) {
        CC obj1 = new CC();
        obj1.pay(1000);

        GPay obj2 = new GPay();
        obj2.pay(2000);

        FlipkartPay obj3 = new FlipkartPay();
        obj3.pay(3000);
    }
}