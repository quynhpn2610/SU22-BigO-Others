package Strings;

import java.util.Scanner;

public class StandardString {
    private static String standardString(String s){
        StringBuilder res = new StringBuilder("");
        // int resLen = 0;
        boolean needASpace = false;

        for (int i = 0; i<s.length(); i++) {
            if (s.charAt(i) == ' '){
                needASpace = true;
            }
            else {
                if (needASpace){
                    res.append(" ").append(s.charAt(i));
                    // resLen ++;
                    needASpace = false;
                }
                else {
                    res.append(s.charAt(i));
                    // resLen ++;
                }
            }
        }
        return res.toString().trim();

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(standardString(s));

        sc.close();
    }
}
