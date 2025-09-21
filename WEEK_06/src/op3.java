import java.util.Scanner;
public class op3 {
    public static void main(String[] args){
        System.out.print("Enter a value for N: ");
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int a=0;
        int b=1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(int i = 1; i<=N; i++){
            int next = a+b;
            System.out.print(next + " ");
            a=b;
            b=next;
        }
    }
}
