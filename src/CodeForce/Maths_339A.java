package CodeForce;

import java.util.Scanner;

public class Maths_339A {
    private static void insertionSort(int[] a){
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

    private static String sortString(String s){
        String[] arr = s.split("\\+");
        int[] a = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            a[i] = Integer.parseInt(arr[i]);
        }

        insertionSort(a);

        StringBuilder sortedS = new StringBuilder();

        for (int i = 0; i < a.length-1; i++) {
            sortedS.append(a[i]).append("+");
        }
        sortedS.append(a[a.length-1]);

        return sortedS.toString();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(sortString(s));
    }
}
