import java.util.Scanner;
public class op4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a decimal number:");
        int num = s.nextInt();
        String Hex = " ";
        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E'};
        while (num != 0) {
            int remainder = num % 16;
            Hex = hexChars[remainder] + Hex;
            num = num / 16;
        }
        System.out.println("Hexadecimal eq = " + Hex);
    }
}
