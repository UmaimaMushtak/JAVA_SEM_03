package week10_sem3;
class StaticPolymorphism{
    public void minMaxAdd(int a, int b){
        int min = Math.min(a,b);
        int max = Math.max(a,b);
        int sum = a+b;
        System.out.println(" sum = " +  sum + " min = " + min + " max = " + max);
    }
    public void minMaxAdd(double a, double b){
        double min = Math.min(a,b);
        double max = Math.max(a,b);
        double sum = a+b;
        System.out.println(" sum = " +  sum + " min = " + min + " max = " + max);
    }
    public void minMaxAdd(char a, char b){
        char min = (a < b) ? a : b;
        char max = (a > b) ? a : b;
        int sum = a + b;
        System.out.println(" sum = " +  sum + " min = " + min + " max = " + max);
    }
}
public class t3 {
    public static void main(String[] args) {
        StaticPolymorphism sp = new StaticPolymorphism();
        sp.minMaxAdd(2,4);
        sp.minMaxAdd(2.3, 7.0);
        sp.minMaxAdd('c', 'd');
    }
}
