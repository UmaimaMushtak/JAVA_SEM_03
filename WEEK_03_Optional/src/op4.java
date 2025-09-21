import java.util.Scanner;
public class op4 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter 1st number:");
        float a = s.nextFloat();
        System.out.print("Enter 2nd number");
        float b = s.nextFloat();
        float quotient = a/b;
        float remainder = a%b;
        System.out.println("quotient = " + quotient);
        System.out.println("remainder = " + remainder);
    }
}
