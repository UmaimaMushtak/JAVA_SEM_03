public class task3 {
    public static void main(String[] args){
        int []arr = {10,20,30,40,50};
        System.out.println("Elements of the original array: ");
        for(int i= 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Elements after swapping:");
        int temp = arr[0];
        arr[0]=arr[arr.length-1];
        arr[arr.length-1]=temp;
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
