package Sorting;

import java.util.Scanner;

public class FindMedian {
    private static void insertionSort(int[] a){
        int n = a.length;
        for (int i = 1; i < n; i++) {
            int key = a[i];
            int j = i-1;

            while(j >= 0 && a[j] > key){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        insertionSort(arr);

        if(n % 2 == 0){
            System.out.println((double)(arr[n/2] + arr[n/2 - 1])/2);
        }
        else System.out.println(arr[n/2]);

        sc.close();

    }
}
