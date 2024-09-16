public class Account {
    private double balance;


    public void deposit(double amount){
        balance = balance + amount;
    }
    public void withdraw(double amount){
        if(amount <= balance){
        balance = balance - amount;
    }else{
        System.err.println("Insufficient funds.");
    }
    }
    public double getBalance(){
        return balance;
    }
    public void transfer(double amount, Account otherAccount){
        otherAccount.deposit(amount);
        balance = balance - amount;
    }
}
