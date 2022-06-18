package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class LargestDigit {
    private static ArrayList<Integer> toIntArray(int n){
        ArrayList<Integer> arr = new ArrayList<>();
        while (n>0){
            arr.add(n %= 10);
            n /= 10;
        }
        return arr;
    }
    private static int findLargest(ArrayList<Integer> arr, int n){
        if (arr.size() == 1) return arr.get(0);
        return Math.max(arr.get(n-1), findLargest(arr, n-1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = toIntArray(n);
        System.out.println(findLargest(arr, n));
        sc.close();
    }
}
