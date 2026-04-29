public class Account{
    int acc_ID;
    String acc_Name;
    double acc_Bal;
    static int min_Bal = 500;

    Account(int ID, String Name, double Amount){
        System.out.println("Account class constructor");
        this.acc_ID = ID;
        this.acc_Name = Name;
        this.acc_Bal = Amount;
    }

    public void deposit_amount(double amount){
        System.out.println("Amount deposited successfully");
        this.acc_Bal = this.acc_Bal+amount;
        System.out.println("Current Balance is:"+acc_Bal);
    }

    public void withdrawal(double amount){
        System.out.println("Amount withdrew successfully");
        this.acc_Bal = this.acc_Bal-amount;
        System.out.println("Current Balance is:"+acc_Bal);
    }

    public double get_Bal(){
        return this.acc_Bal-min_Bal;
    }

    public static void main(String[] args) {
        Account a1 = new Account(101, "Rahul", 5000.50);
        Account a2 = new Account(102, "Sonia", 25000.25);
        a1.deposit_amount(500.00);
        a1.deposit_amount(500.00);
        a1.withdrawal(50.00);
        System.out.println(a1.get_Bal());
        System.out.println(a2.get_Bal());
    }
}