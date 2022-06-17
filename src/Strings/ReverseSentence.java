package Strings;

import java.util.Scanner;

public class ReverseSentence {
    private static String reverseSentence(String s){
        String[] sArr = s.split(" ");
        StringBuilder res = new StringBuilder("");
        res.append(sArr[sArr.length-1]);
        for (int i = sArr.length-2; i>= 0; i--) {
            res.append(" ").append(sArr[i]);
        }
        return res.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverseSentence(s));

        sc.close();
    }
}
