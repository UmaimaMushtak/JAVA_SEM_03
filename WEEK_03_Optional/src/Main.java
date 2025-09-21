//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a = 23;
        int b = 56;
        System.out.println("Before swapping");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        // swapping two numbers
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping");
        System.out.println("a = " + a);
        System.out.println("b =" + b);


    }
}