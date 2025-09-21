public class task4 {
    public static void main(String[] args) {
        String a = "aia";
        int len = a.length();
        boolean ispalin = true;
        for(int i = 0; i<len/2; i++){
           if(a.charAt(i)!=a.charAt(len-i-1)){
                ispalin = false;
                break;
            }
        }
        if(ispalin){
            System.out.println("palindrome");
        } else {
            System.out.println("not a palindrome");
        }
    }
}
