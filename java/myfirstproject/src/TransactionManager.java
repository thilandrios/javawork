public class TransactionManager {
    public static void main(String[] args){
        Account usAccount = new Account();
        Account chAccount = new Account();
        chAccount.deposit(10000);
        usAccount.deposit(100);
        System.out.println("The initial balance of your US account is " +usAccount.getBalance());
        usAccount.withdraw(20);
        System.out.println("After withdrawing 20 dollars, your new balances are as follows");
        System.out.println("US Checking: " +usAccount.getBalance());
        System.out.println("Off-Shore Checking: " +chAccount.getBalance());
        String a = "My name is";
        System.out.println("Hi " + a + " what?");

    }
    
}
