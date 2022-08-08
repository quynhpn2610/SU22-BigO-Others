package Final;

import java.util.Arrays;
import java.util.Scanner;

public class Merge {
    static int[] mergeArray(int[] a, int[] b){
        int[] merged = new int[a.length+ b.length];

        int i=0, j=0, k=0;

        while(i<a.length){
            merged[k] = a[i];
            i++;
            k++;
        }

        while(j< b.length){
            merged[k] = b[j];
            j++;
            k++;
        }

        Arrays.sort(merged);

        return merged;
    }

    static void findKthSmallestElement(int[] merged, int k){
        System.out.println(merged[k]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = Integer.parseInt(sc.next());
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        int[] a = new int[m];
        int[] b = new int[n];
        for (int i = 0; i < m; i++) {
            a[i] = Integer.parseInt(sc.next());
        }
        for (int i = 0; i < n; i++) {
            b[i] = Integer.parseInt(sc.next());
        }
        int[] merged = mergeArray(a, b);
        findKthSmallestElement(merged, k);
    }

}
