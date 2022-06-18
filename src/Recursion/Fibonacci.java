package Recursion;

import java.util.Scanner;

public class Fibonacci {
    private static int Fib(int n){
        if (n < 2) return 1;
        return Fib(n-1) + Fib(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Fib(n));
        sc.close();
    }
}
