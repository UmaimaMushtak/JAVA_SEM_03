public class op5 {
    public static void main(String[] args){
        for(int i=1; i<=4; i++){
            for(int s=i; s<=3; s++){
                System.out.print(" ");
            }
            for(int j=1; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i= 2; i>=1; i--){
            for(int s=2; s>=i; s--){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
