//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Odd numbers from 1 to 99:");
        for(int i=1; i<100; i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}