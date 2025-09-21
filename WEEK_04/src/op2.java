public class op2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        if (a>b && a>c && a>d) {
            System.out.println("largest =" + a);
        } else if (b>a && b>c && b>d){
            System.out.println("largest =" + b);
        } else if (c>a && c>b && c>d){
            System.out.println("largest = " + c);
        } else {
            System.out.println("largest = " + d);
        }
    }
}