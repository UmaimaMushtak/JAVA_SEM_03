import java.util.Scanner;
public class task6 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int []num = {10,20,30,40,50};
        System.out.println("Enter Element to Search: ");
        int E = s.nextInt();
        for(int i = 0; i<num.length; i++){
            if(E==num[i]){
                System.out.println("Element is found at index " + i);
                break;
            } else {
                System.out.println("Not found");
                break;
            }
        }
        s.close();
    }
}
