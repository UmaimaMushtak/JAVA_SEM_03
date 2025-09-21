import java.util.Scanner;
public class op3 {
    public static void main(String[] args){
        System.out.print("Enter value for N:");
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int sum = 0;
        for(int i=1; i<=N; i++){
            if(i%2==0){
                sum += i;
            }
        }
        System.out.println("sum = " + sum);
    }
}
