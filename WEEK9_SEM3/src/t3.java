class Account{
    int ID;
    String Acc_holder_name;
    String Address;

    void deposit(int amt){
        System.out.printf("Amount %d depositing..."+amt);
    }
    void withdraw(int amt){
        System.out.printf("Amount %d withdrawn..."+amt);
    }
    static void calculateSimpleInterest(double P, double R, int T){
        double interest = (P*R*T)/100;
        System.out.println("Simple interest = " + interest);
    }
    static void calculateCompoundInterest(double P, double R, int timesCompoundedPerYear, int T) {
            double amount = P * Math.pow(1 + R / timesCompoundedPerYear, timesCompoundedPerYear * T);
            double CI = amount - P;
            System.out.println("Compound Interest = " + CI);
    }
}
public class t3 {
    public static void main(String[] args) {
        Account a1 = new Account();
        Account.calculateSimpleInterest(200, 5, 1);
        a1.calculateCompoundInterest(200, 5, 2, 1);
    }
}
