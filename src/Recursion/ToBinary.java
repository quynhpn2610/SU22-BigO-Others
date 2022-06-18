package Recursion;

import java.util.Scanner;
import java.util.Stack;

public class ToBinary {
    private static String toBinaryR(int n){
        if (n>0){
            return (toBinaryR(n/2) + (n%2));
        }
        else return "";
    }

    private static String toBinary(int n){
        if (n==0) return "0";
        else return toBinaryR(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(toBinary(n));
        sc.close();
    }
}
