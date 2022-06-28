package Sorting;

import java.util.Scanner;

public class Descending {
    private static void merge(int[] L, int n1, int[] R, int n2, int[] a, int n) {
        int i, j, k;
        i = j = k = 0;

        // Populate big array a with either L[i] from L array or R[j] from R array
        while(i<n1 && j<n2) {
            if(L[i] > R[j]) {
                a[k] = L[i];
                i++;
            }
            else {
                a[k] = R[j];
                j++;
            }
            k++; // move pointer of the big arr
        }

        // if either L or R array runs out of elements
        while (i<n1) {
            a[k] = L[i];
            i++;
            k++;
        }
        while (j<n2) {
            a[k] = R[j];
            j++;
            k++;
        }
    }

    static void descMergeSort(int[] arr, int n) {
        // check if arr length <= 1
        if (n > 1) {

            // arr length > 1
            int n1 = n / 2; // length of L arr
            int n2 = n - n1; // length of R arr
            int[] L = new int[n1];
            int[] R = new int[n2];

            // Populate L and R with arr elements
            for (int i = 0; i < n1; i++) {
                L[i] = arr[i];
            }

            for (int i = 0; i < n2; i++) {
                R[i] = arr[i + n1];
            }

            descMergeSort(L, n1);
            descMergeSort(R, n2);
            merge(L, n1, R, n2, arr, n);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        descMergeSort(arr, n);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
