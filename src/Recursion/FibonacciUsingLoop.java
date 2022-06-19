package Recursion;

import java.util.Scanner;

public class FibonacciUsingLoop {
    private static int Fib(int n){
        if (n==0) return 0;
        if (n==1) return 1;

        int first = 0;
        int second = 1;
        int fibAtCount = 0;
        int count = 2;

        while(count<n){
            fibAtCount = first+second;
            count++;
            first = second;
            second = fibAtCount;
        }
        return fibAtCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Fib(n));
        sc.close();
    }
}
