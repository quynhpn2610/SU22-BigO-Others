package Review;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class FirstRepeatedChar {
    private static void printFirstRepeated(String s){
        HashSet<Character> set = new HashSet<>();
        for (char c:
             s.toCharArray()) {
            if (set.contains(c)){
                System.out.println(c);
                break;
            }
            else {
                set.add(c);
            }
        }
        if(set.size() == s.length()) {
            System.out.println("null");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.next();
        printFirstRepeated(s);
    }
}
