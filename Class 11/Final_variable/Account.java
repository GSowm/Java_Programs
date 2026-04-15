class Account{
    final int min_Bal = 500;
    public static void main(String[] args) {
        Account a1 = new Account();
        System.out.println(a1.min_Bal);
        //a1.min_Bal = 600;
        System.out.println(a1.min_Bal);
    }
}