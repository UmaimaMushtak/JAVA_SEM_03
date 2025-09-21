import java.util.Scanner;
public class op3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Celsius");
        double C = sc.nextDouble();
        double F = (C*9/5)+32;
        System.out.println("F = " + F);
        sc.close();
    }
}
