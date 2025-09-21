//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int binarysearch(int a[], int n){
        int s = 0;
        int e = a.length-1;
        while(s<e){
            int mid = (s+e)/2;
            if(n==a[mid]){
                return mid;
            } else if(n>a[mid]){
                s=mid+1;
            } else {
                e=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6,7};
    int b = 4;
    int result = binarysearch(arr,b);
    if(result!=-1){
        System.out.println("Element found at index "+result);
    } else {
        System.out.println("Element not found");
    }
    }
}