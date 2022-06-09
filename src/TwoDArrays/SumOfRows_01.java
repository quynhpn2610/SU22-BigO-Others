package TwoDArrays;

import java.util.Scanner;

public class SumOfRows_01 {
    private static void sumCalc(int[][] a){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                sum += a[i][j];
            }
            System.out.println(i + ": " + sum);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] a = new int[m][n];

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }

        }

        sumCalc(a);
        sc.close();



    }
}
