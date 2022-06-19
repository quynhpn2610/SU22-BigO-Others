package MidTerm;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Sudoku {
    private static boolean rowOK(int[][] a){
        Set<Integer> set;
        int rowNum = a.length;
        int colNum = a[0].length;
        for (int i = 0; i < rowNum; i++) {
            set = new HashSet<>();
            for (int j = 0; j < colNum; j++) {
                set.add(a[i][j]);
            }
            if (set.size() != 9) return false;
        }

        return true;
    }

    private static boolean colOK(int[][] a){
        Set<Integer> set;
        int rowNum = a.length;
        int colNum = a[0].length;
        for (int j = 0; j < colNum; j++) {
            set = new HashSet<>();
            for (int i = 0; i < rowNum; i++) {
                set.add(a[i][j]);
            }
            if (set.size() != 9) return false;
        }
        return true;
    }

    private static boolean allBlockOK(int[][] a){
        Set<Integer> set;
        int rowNum = a.length;
        int colNum = a[0].length;
        int r1 = 0;
        int r2 = 2;
        int c1 = 0;
        int c2 = 2;
        while(r2 < rowNum){
            while(c2 < colNum){
                set = new HashSet<Integer>();
                for (int i = 0; i <= r2; i++) {
                    for (int j = 0; j <= c2; j++) {
                        set.add(a[i][j]);
                    }
                }
                if (set.size() != 9) return false;
                c1 += 3;
                c2 += 3;
            }

            r1 += 3;
            r2 += 3;
        }
        return true;
    }


    private static boolean isSudoku(int[][] a){
        boolean checkRow = rowOK(a);
        boolean checkCol = colOK(a);
        boolean checkBlock = allBlockOK(a);
        if (checkRow && checkCol && checkBlock){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        if (isSudoku(mat)) System.out.println("YES");
        else System.out.println("NO");

        sc.close();

    }
}
