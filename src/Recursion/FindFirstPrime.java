package Recursion;

import java.util.Scanner;

public class FindFirstPrime {
    private static boolean isPrime(int n){
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    private static int findFirstPrime(int[] arr, int index){
        if (index >= arr.length) return -1;
        if (isPrime(arr[index])) return index;
        index ++;
        return findFirstPrime(arr, index);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(sc.next());
        }
        System.out.println(findFirstPrime(arr, 0));
        sc.close();
    }

}
