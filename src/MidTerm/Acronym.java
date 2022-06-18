package MidTerm;

import java.util.Locale;
import java.util.Scanner;

public class Acronym {
    private static String getAcr(String s){
        String[] arr = s.split(" ");
        StringBuilder res = new StringBuilder("");
        for (int i = 0; i < arr.length; i++) {
            res.append(Character.toUpperCase(arr[i].charAt(0)));
        }
        return res.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(getAcr(s));
        sc.close();
    }
}
