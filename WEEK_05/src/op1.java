public class op1 {
    public static void main(String[] args){
        int []arr = {10, 20, 30, 80, 50};
        int l = arr[0];
        for(int i =1; i<arr.length; i++){
            if(arr[i] > l){
            l = arr[i];
            }
        }
        System.out.println("largest = " + l);
    }
}
