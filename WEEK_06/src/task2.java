import java.util.Scanner;
public class task2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = s.nextInt();
        int count = 0;
        for(int i = 1; i<=num; i++){
            if(num%i==0){
                count += 1;
            }
        } if(count>2){
            System.out.println("Not Prime");
        } else {
            System.out.println("Prime");
        }
    }
}
