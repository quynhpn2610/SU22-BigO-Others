package CodeForce;

import java.util.Scanner;

public class Maths_339A {
    private static void insertionSort(String s){
        String[] arr = s.split("\\+");
        int[] a = new int[arr.length];

        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int j = i-1;
            while(j>=0 && a[j] > key){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
    }
}
