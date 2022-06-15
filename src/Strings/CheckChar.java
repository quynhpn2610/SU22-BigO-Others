package Strings;

import java.util.*;

public class CheckChar {
    private static boolean checkChar(String s){
        boolean hasBIGO = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'B' || s.charAt(i) == 'I' || s.charAt(i) == 'G' || s.charAt(i) == 'O' ||
                    s.charAt(i) == 'b' || s.charAt(i) == 'i' || s.charAt(i) == 'g' || s.charAt(i) == 'o'){
                hasBIGO = true;
                break;
            }
        }

        return hasBIGO;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if (checkChar(s)) System.out.println("YES");
        else System.out.println("NO");
        sc.close();
    }
}
