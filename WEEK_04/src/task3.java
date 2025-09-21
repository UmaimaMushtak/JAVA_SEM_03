import java.util.Scanner;
public class task3 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = s.nextInt();
        for(int i = 1; i <= 10; i++){
            int pr = a*i;
            System.out.println(a + "x" + i + "=" + pr);
        }
        s.close();
    }
}
