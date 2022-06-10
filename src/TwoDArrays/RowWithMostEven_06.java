package TwoDArrays;

import java.util.Scanner;

public class RowWithMostEven_06 {
    private static int countEven(int[] a) {
        int countEven = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                countEven++;
            }
        }
        return countEven;
    }

    public static void findMostEvenRow(int[][] a) {
        int max = 0;
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (countEven(a[i]) > max) {
                max = countEven(a[i]);
                index = i;
            }
        }
        System.out.println(index);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] a = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }


        findMostEvenRow(a);
        sc.close();

    }
}

