// find element that is max of row and min of col

package TwoDArrays;

import java.util.Scanner;

public class Saddle_09 {
    private static int count(int[][] data) {
        int nRows = data.length;
        int nCols = data[0].length;
        boolean[][] maxThisRow = new boolean[nRows][nCols];
        boolean[][] minThisCol = new boolean[nRows][nCols];

        // find max of row
        for (int i = 0; i < data.length; i++) {
            int max = Integer.MIN_VALUE;
            int row = 0;
            int col = 0;
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] > max) {
                    max = data[i][j];
                    row = i;
                    col = j;
                }
            }
            maxThisRow[row][col] = true;

            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] == max) {
                    maxThisRow[i][j] = true;
                }
            }
        }

        // Find min of col
        for (int column = 0; column < data[0].length; column++) {
            int min = Integer.MAX_VALUE;
            int r = 0;
            int c = 0;
            for (int row = 0; row < data.length; row++) {
                if (data[row][column] < min) {
                    min = data[row][column];
                    r = row;
                    c = column;
                }
            }
            minThisCol[r][c] = true;

            for (int row = 0; row < data.length; row++) {
                if (data[row][column] == min) {
                    minThisCol[row][column] = true;
                }
            }
        }

        // loop through either matrix to find matching values
        int count = 0;
        for (int i = 0; i < minThisCol.length; i++) {
            for (int j = 0; j < minThisCol[0].length; j++) {
                if (minThisCol[i][j] & maxThisRow[i][j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] a = new int[m][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int ans = count(a);
        System.out.println(ans);
        sc.close();
    }
}
