import java.util.Scanner;
import java.util.HashMap;
public class op5 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        str = str.toLowerCase();
        HashMap<Character, Integer> freqMap = new HashMap<>();
                for (char ch : str.toCharArray()) {
                    if (ch != ' ') {
                        freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
                    }
                }
                System.out.println("Character frequencies:");
                for (char ch : freqMap.keySet()) {
                    System.out.println(ch + " : " + freqMap.get(ch));
                }

                sc.close();
            }
        }


