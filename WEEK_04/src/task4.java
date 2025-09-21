import java.util.Scanner;
public class task4 {
    public static void main(String[] args){
        System.out.println("Enter a value for N:");
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int sum = 0;
        for(int i = 1; i<=N; i++){
            sum += i;
        }
        System.out.println("sum = " + sum);
    }
}
