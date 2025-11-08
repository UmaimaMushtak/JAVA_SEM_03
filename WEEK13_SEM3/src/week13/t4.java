package week13;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
public class t4 {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            FileReader fr = new FileReader("abc");
            int c = fr.read();
            int count = 0;
            while (c >= 0) {
                count++;
                c = fr.read();
            }
            fr.close();
            System.out.println("Number of characters:"+ count);
        } catch(Exception e){
            System.out.println("An error occurred");
        }
    }
}
