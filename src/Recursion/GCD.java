package Recursion;

import java.util.Scanner;

public class GCD {
    private static int GCD(int a, int b){
        if (b==0) return a;
        return GCD(b, a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        System.out.println(GCD(a, b));
        sc.close();
    }
}
