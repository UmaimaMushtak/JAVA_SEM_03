public class task5 {
    public static void main(String[] args){
        int a = 1978;
        int sum = 0;
        int temp = a;
        while(temp!=0){
            int digit = temp%10;
            sum += digit;
            temp = temp/10;
        }
        System.out.println("sum = " + sum);
    }
}
