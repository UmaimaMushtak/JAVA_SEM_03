import java.util.Scanner;
public class task5 {
    public static void main(String[] args){
        System.out.println("Enter a number:");
        Scanner s = new Scanner(System.in);
        double num = s.nextDouble();
        while(num>=10){
            num = num / 2;
            System.out.println(num);
        }
    }
}
