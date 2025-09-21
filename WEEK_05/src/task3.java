public class task3 {
    public static void main(String[] args){
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            // Print spaces first
            for (int s = 1; s <= rows - i; s++) {
                System.out.print(" ");
            }
            // Print numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(); // Move to next line
        }
    }
}
