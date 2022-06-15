package Strings;

import java.util.Scanner;

public class CheckNum {
    private static void printNum(String s){
        int count = 0;
        for (char ch: s.toCharArray()){
            if ((int) ch > 47 && (int) ch < 58){
                count ++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        printNum(s);

        sc.close();
    }
}
