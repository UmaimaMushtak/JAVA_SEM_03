import java.util.Scanner;
public class op5 {
    public static void main(String[] args){
        System.out.println("Enter a number:");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        for(int i = 1; i <= num; i++){
            if(num%i==0){
                System.out.println(i);
            }
        }
    }
}
