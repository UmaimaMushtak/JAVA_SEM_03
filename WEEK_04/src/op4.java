import java.util.Scanner;
public class op4 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter an year:");
        int year = s.nextInt();
        if (year%400==0 || (year%4==0 && year%100!=0)){
            System.out.println("leap year");
        } else {
            System.out.println("not a leap year");
        }
    }
}
