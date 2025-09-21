public class task3 {
    public static void main(String[] args) {
        String a = "UMAIMA";
        int len = a.length();
        String s = " ";
        for(int i=0; i<len; i++){
            s = a.charAt(i) + s;
        }
        System.out.println(s);
    }
}
