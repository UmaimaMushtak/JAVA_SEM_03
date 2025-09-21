public class task7 {
    public static int gcd(int N, int d){
        while(N!=0){
            int temp = N;
            N = d%N;
            d = temp;
        }
        return d;
    }
    
    public static void main(String[] args) {
    int x = 20;
    int y = 14;
    int GCD = gcd(x,y);
        System.out.println("GCD = " + GCD);
    }
}
