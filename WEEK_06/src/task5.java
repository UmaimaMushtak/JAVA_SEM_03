public class task5 {
    public static void main(String[] args){
        System.out.println("Printing prime numbers from 0 to 100:");
        for(int i = 2; i<=100; i++){
            int count =0;
            for(int j = 1; j<=i; j++){
                if(i%j==0){
                    count = count+1;
                }
                }
            if(count==2){
                System.out.println(i);
            }
            }
        }
    }

