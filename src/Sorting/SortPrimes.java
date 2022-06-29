package Sorting;

import java.util.*;

public class AscendingPrimes {
    // Sieve of Eratosthenes
    static boolean[] primes = new boolean[1000000];

    static void sieve(int n){
        for (int i = 0; i <= n; i++) {
            primes[i] = true;
            primes[1] = false;
        }

        for (int p = 2; p*p < n; p++) {
            if (primes[p] == true){
                for (int i = p*2; i <= n; i+=p){
                    primes[i] = false;
                }
            }
        }
    }

    static void sort(int[] arr, int n){
        sieve(1000005);

        List<Integer> nonPrimes = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (primes[arr[i]] == false){
                nonPrimes.add(arr[i]);
            }
        }

        Collections.sort(nonPrimes); // viet lai thanh ham sort

        int j = 0;

        for (int i = 0; i < n; i++) {
            if (primes[arr[i]] == true){
                System.out.println(arr[i] + " ");
            }
            else{
                System.out.println(nonPrimes.get(j) + " ");
                j++;
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sort(arr, n);
    }


}
