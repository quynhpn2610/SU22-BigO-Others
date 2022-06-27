package Sorting;

import java.util.Scanner;

public class Ascending {
    public static int[] ascInsertionSort(int[] a){
        for (int i = 1; i < a.length; i++) {
            int x = a[i];
            for (int j = i; j > 0; j--) {
                if (a[j-1] <= x){
                    break;
                }
                a[j] = a[j-1];
            }
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

    }
}
