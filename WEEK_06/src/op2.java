public class op2 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 60, 50, 40, 70};
        int largest = arr[0];
        int secondlargest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != largest && arr[i]>secondlargest){
                    secondlargest = arr[i];
            }
        }
        System.out.println("secondlargest = " + secondlargest);
    }
}
