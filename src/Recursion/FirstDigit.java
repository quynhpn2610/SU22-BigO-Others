package Recursion;

import java.util.Scanner;

public class FirstDigit {
    private static int findFirst(int n){
        if (Math.abs(n) < 10){
            return n;
        }
        return findFirst(n/10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(findFirst(n));
        sc.close();
    }
}
