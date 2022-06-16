package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class AfterDotSpace {
    private static String Capitalize(String s){
        char[] sArr = s.toCharArray();

        for (int i = 2; i < sArr.length; i++){
            if (sArr[i-1] == ' ' && sArr[i-2] == '.'){
                sArr[i] = Character.toUpperCase(sArr[i]);
            }
        }
        return String.copyValueOf(sArr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(Capitalize(s));

        sc.close();
    }
}
