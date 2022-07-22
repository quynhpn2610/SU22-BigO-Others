package Review;

import java.util.Scanner;

public class PrintIndex {
    // Lam lai bang Binary Search
    private static int printIndexOfElement(int element, int[] arr){
        int left = 0;
        int right = arr.length-1;
        int mid;

        while(left <= right){
            mid = left + (right-left)/2;
            if (arr[mid] == element) return mid + 1;

            else if (arr[mid] < element) left = mid + 1;

            else right = mid - 1;

        }

        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int element = Integer.parseInt(sc.next());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(printIndexOfElement(element, arr));
        sc.close();
    }
}
