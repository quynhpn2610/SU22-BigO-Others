package Recursion;

import java.util.Scanner;

public class SumOfEven {
    private static int findSumOfEven(int[] arr, int index, int sum){
        if (index >= arr.length) return sum;
        if (arr[index]  % 2 == 0) {
            sum += arr[index];
        }
        index ++;
        return findSumOfEven(arr, index, sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(sc.next());
        }
        System.out.println(findSumOfEven(arr, 0, 0));
        sc.close();
    }
}
