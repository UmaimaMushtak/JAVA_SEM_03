public class task2 {
    public static void Bubblesort(int a[]){
        for(int i =0; i<a.length-1; i++){
            for(int j=0; j<a.length-i-1; j++){
                if(a[j]>a[j+1]){
                    int t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={23, 45, 67, 89,49};
        Bubblesort(arr);
        for(int e:arr){
            System.out.print(e + " ");
        }
    }
}
