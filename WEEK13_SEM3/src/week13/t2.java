package week13;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class t2 {
    public static void main(String[] args) {
        String filename = "XYZ";
        try{
            FileWriter fw1 = new FileWriter(filename);
            fw1.write("I like java");
            fw1.close();
        } catch (IOException e) {
            System.out.println("An error occured");
        }
    }
}
