package Review;

import java.util.Scanner;

public class PrintIndex {
    private static int printIndexOfElement(int element, int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element){
                return i+1;
            }
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
