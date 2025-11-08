package week13;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception{
    String filename = "abc";
    try{
        FileWriter fw = new FileWriter(filename);
        fw.close();
    } catch (IOException e) {
        System.out.println("An error occurred");
    }
    }
}