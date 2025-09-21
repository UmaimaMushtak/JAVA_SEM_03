public class task4 {
    public static void main(String[] args){
        int []arr = {1,2,3,4,5,6};
        int largest = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }
        System.out.println("largest = " + largest);
        int smallest = arr[0];
        for(int i=0; i<arr.length; i++){
            if(smallest > arr[i]){
                smallest = arr[i];
            }
        }
        System.out.println("smallest = " + smallest);
    }
}
