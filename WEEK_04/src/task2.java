public class task2 {
    public static void main(String[] args){
        int a = 2;
        int b = 5;
        int c = 0;
        // finding the largest of the three numbers
        if(a>b) {
            if (a > c) {
                System.out.println(a + "is the largest number");
            } else {
                System.out.println(b + "is the largest number");
            }
        } else {
            if(b>c){
                System.out.println(b + "is the largest number");
            } else {
                System.out.println(c + "is the largest number");
            }
        }
    }
}
