package week13;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;
public class t3 {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            FileReader fr = new FileReader("abc");
            FileWriter fw = new FileWriter("XYZ");
            int c = fr.read();
            while (c >= 0) {
                fw.write((char) c);
                c = fr.read();
            }
            fr.close();
            fw.close();
        } catch (Exception e) {
            System.out.println("an error occurred");
        }
    }
}
