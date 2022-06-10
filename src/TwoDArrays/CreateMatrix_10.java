package TwoDArrays;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class CreateMatrix_10 {
    private static int[][] generateMatrix(int row, int col, int a, int b, int p) {
        int[][] matrix = new int[row][col];
        int[] matrixOneRow = new int[row * col];
        matrixOneRow[0] = a;
        matrixOneRow[1] = b;
        for (int i = 2; i < matrixOneRow.length; i++) {
            matrixOneRow[i] = (matrixOneRow[i - 1] + matrixOneRow[i - 2]) % p;
        }
        int countRow = 0;
        int index = 0;
        while (countRow < row) {
            int countColumn = 0;
            while (countColumn < col) {
                matrix[countRow][countColumn] = matrixOneRow[index];
                index++;
                countColumn++;
            }
            countRow++;
        }
        return matrix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int p = sc.nextInt();
        int[][] mat = generateMatrix(m, n, a, b, p);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }


}
