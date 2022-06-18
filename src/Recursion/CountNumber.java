package Recursion;

import java.util.Scanner;

public class CountNumber {
    private static int countNum(int n){
        if (Math.abs(n) < 10){
            return 1;
        }
        return (1+countNum(n/10));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countNum(n));
        sc.close();
    }
}
