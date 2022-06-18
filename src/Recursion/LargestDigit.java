package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class LargestDigit {
    private static int findLargestR(int n, int max){
        if (n==0) return max;
        else{
            if ((n%10) > max){
                max = n%10;
            }
            return findLargestR(n/10, max);
        }
    }

    private static int findLargest(int n){
        if (n==0) return 0;
        return findLargestR(Math.abs(n), Integer.MIN_VALUE);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(findLargest(n));
        sc.close();
    }
}
