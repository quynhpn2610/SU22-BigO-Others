// find max of row & col & 2 diagonals passing through it
package TwoDArrays;

import java.util.Scanner;

public class QueensCount_08 {
    private static int countQueen(int[][] a){
        int queenCount = 0;
        int nRow = a.length;
        int nCol = a[0].length;
        boolean[][] maxEachRow = new boolean[nRow][nCol];
        boolean[][] maxEachCol = new boolean[nRow][nCol];
        boolean[][] maxRowCol = new boolean[nRow][nCol];

        // Loop qua tung hang
        for (int i = 0; i < a.length; i++) {
            int maxThisRow = Integer.MIN_VALUE;
            int maxCol = 0;
            int maxRow = 0;
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > maxThisRow) {
                    maxThisRow = a[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
            maxEachRow[maxRow][maxCol] = true;
        }
        // Loop qua tung cot
        for (int j = 0; j < a[0].length; j++) {
            int maxThisCol = Integer.MAX_VALUE;
            int maxCol = 0;
            int maxRow = 0;
            for (int i = 0; i < a.length; i++) {
                if(a[i][j] > maxThisCol){
                    maxThisCol = a[i][j];
                    maxCol = j;
                    maxRow = i;
                }
            }
        }
        // Loop qua 2 matrix de tim matching elements (both true)
        for (int i = 0; i < maxEachRow.length; i++) {
            for (int j = 0; j < maxEachRow[i].length; j++) {
                if (maxEachRow[i][j] & maxEachCol[i][j]) {
                    queenCount ++;
                    maxRowCol[i][j] = maxEachRow[i][j];
                }
            }
        }



        return queenCount;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        int[][] a = new int[m][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }
}
