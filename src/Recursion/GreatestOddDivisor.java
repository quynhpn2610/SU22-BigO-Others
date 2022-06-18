package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GreatestOddDivisor {
    private static int findDivisor(int n){
        if (n % 2 == 1){
            return n;
        }
        return (findDivisor(n/2));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(findDivisor(n));
        sc.close();
    }
}
