package week11;
interface Account{
    void deposit();
    void withdraw();
    static void aboutbank(){
        System.out.println("Bank info...");
    }
    default void takeloan(){
        System.out.println("Loan facility not available...");
    }
}
class Saving implements Account{
    public void deposit(){
        System.out.println("Enter amount to deposit");
    }
    public void withdraw(){
        System.out.println("Enter amount to withdraw");
    }
    public void takeloan(){
        System.out.println("Taking loan...");
    }
}
class Current implements Account{
    public void deposit(){
        System.out.println("Enter amount to deposit");
    }
    public void withdraw(){
        System.out.println("Enter amount to withdraw");
    }
}
public class Main {
    public static void main(String[] args) {
    Current c = new Current();
    c.deposit();
    c.withdraw();
    Account.aboutbank();
    Saving s = new Saving();
    s.deposit();
    s.withdraw();
    s.takeloan();
    }
}