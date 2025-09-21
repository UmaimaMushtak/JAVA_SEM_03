import java.util.Scanner;
public class op3 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = s.nextInt();
        int reverse = 0;
        int temp = num;
        while(temp!=0){
            int digit = temp%10;
            reverse = reverse*10 + digit;
            temp = temp/10;
        }
        if(reverse==num){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
