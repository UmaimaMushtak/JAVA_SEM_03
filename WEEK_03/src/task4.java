import java.util.Scanner;
public class task4 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER 1ST NUMBER:");
        int a = s.nextInt();
        System.out.println("ENTER 2ND NUMBER:");
        int b = s.nextInt();
        System.out.println("ENTER 3RD NUMBER:");
        int c = s.nextInt();
        float avg = (a+b+c)/3.0f;
        System.out.println("avg = " + avg);
    }
}
