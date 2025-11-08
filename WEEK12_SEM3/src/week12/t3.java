package week12;
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
class BankAcc{
    double balance;
    String acc_holder_name;

    BankAcc(double balance, String acc_holder_name){
        this.balance = balance;
        this.acc_holder_name = acc_holder_name;
    }
    void withdraw(int amount) throws InsufficientFundsException{
        if(amount>balance){
            throw new InsufficientFundsException("Insufficient balance");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. New balance: " + balance);
    }
    void deposit(double amount){
        balance += amount;
    }
    public double getBalance() {
        return balance;
    }
}
public class t3 {
    public static void main(String[] args) {
        BankAcc b = new BankAcc(5000, "Umaima");
        try{
            b.withdraw(6000);
        } catch (InsufficientFundsException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }
    }
}
