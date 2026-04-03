public class Acc
{
    public void open_Acc()
    {
        System.out.println("A/C opened successfully");
    }

    public void deposit()
    {
        System.out.println("Deposit done successfully");
    }

    public void withdrawal()
    {
        System.out.println("Withdrawal done successfully");
    }
    public static void main(String[] args)
    {
        Acc a1 = new Acc();
        a1.open_Acc();
        a1.deposit();
        a1.withdrawal();
    }    
}
