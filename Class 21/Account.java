public class Account {
    public void withdrawal() throws InsuffBalException{
        int acc_Bal = 400;
        if (acc_Bal<=1000) {
            throw new InsuffBalException("Buddy! Your Balance is too Low");
        } else {
            System.out.println("Withdraw & Enjoy");
        }
    }

    public static void main(String[] args) {
        Account a = new Account();
        a.withdrawal();
    }
}
