class MathOperations{
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int findLCM(int a, int b) {
        if (a == 0 || b == 0) return 0;
        return Math.abs(a * b) / findGCD(a, b);
    }
}
public class op4 {
    public static void main(String[] args) {
        int num1 = 24;
        int num2 = 36;
        int gcd = MathOperations.findGCD(num1, num2);
        int lcm = MathOperations.findLCM(num1, num2);

        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
}
