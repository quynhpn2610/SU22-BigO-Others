package TwoDArrays;

import java.util.Scanner;

public class AllNegCol {
    private static void findNegCol(int[][] a){

        for (int j = 0; j < a[0].length; j++) {
            boolean allNeg = true;
            for (int i = 0; i < a.length; i++) {
                if (a[i][j] >= 0){
                    allNeg = false;
                    break;
                }
            }
            if (allNeg) {
                System.out.println(j + " ");
            }
        }
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

        findNegCol(a);
        sc.close();

    }
}
