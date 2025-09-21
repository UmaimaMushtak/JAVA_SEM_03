import java.util.Scanner;
public class op1 {
    public static void main(String[] args) {
        System.out.print("Enter an alphabet: ");
        Scanner s = new Scanner(System.in);
        char alpha = s.next().charAt(0);
        if (alpha == 'a' || alpha == 'e' || alpha == 'i' || alpha == 'o' || alpha == 'u') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }
}
