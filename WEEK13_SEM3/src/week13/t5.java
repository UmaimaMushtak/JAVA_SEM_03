package week13;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
public class t5 {
    public static void main(String[] args) throws Exception {
        try {
            FileReader fr = new FileReader("abc");
            BufferedReader br = new BufferedReader(fr);
            String a = br.readLine();
            int count = 0;
            while (a != null) {
                count++;
                a = br.readLine();
            }
            System.out.println("Number of lines:"+count);
            br.close();
        } catch (Exception e) {
            System.out.println("An error occurred.");
        }
    }
}
