package Strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class DistinctChar {
    private static int countDistinctChar(String s){
        int count = 0;
        char[] sArr = s.toCharArray();
        HashSet<Character> mySet = new HashSet<Character>();
        for (char ch:
             sArr) {
            if (mySet.contains(ch)){
                continue;
            }
            mySet.add(ch);
        }
        count = mySet.size();
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(countDistinctChar(s));
        sc.close();
    }
}
