package Sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SortPrimes {

    private static void sortPrimes(int[] nums) {
        List<Integer> nonPrimeIndices = new ArrayList<>();
        List<Integer> nonPrimeNumbers = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (!isPrime(nums[i])) {
                nonPrimeIndices.add(i);
                nonPrimeNumbers.add(nums[i]);
            }
        }

        selectionSort(nonPrimeNumbers);
        for (int i = 0; i < nonPrimeIndices.size(); i++) {
            nums[nonPrimeIndices.get(i)] = nonPrimeNumbers.get(i);
        }
    }


    private static void selectionSort(List<Integer> nums) {
        for (int i = 0; i < nums.size() - 1; i++) {
            int min = nums.get(i);
            int minInd = i;
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(j) < min) {
                    min = nums.get(j);
                    minInd = j;
                }
            }
            int temp = nums.get(i);
            nums.set(i, min);
            nums.set(minInd, temp);
        }
    }

    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static void print(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(sc.next());
        }
        sortPrimes(nums);
        print(nums);
        sc.close();
    }
}