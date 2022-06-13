package TwoDArrays;

import java.util.*;
class QueensCount_08{

    private static boolean isMaxOnThisDirection(int[][] a, int row, int col, int dxx, int dyy)
    {
        // duyệt qua các ô trên hướng này gọi là ô a[x][y]
        // a[row][col] < a[x][y] -> return false
        int x = row+dxx;
        int y = col+dyy;
        // 0 <= x < m, 0 <= y < n
        int m = a.length;
        int n = a[0].length;
        while (x >= 0 && x < m && y >= 0 && y < n){
            if (a[row][col] < a[x][y]){
                return false;
            }
            x += dxx;
            y += dyy;
        }
        return true;
    }
    private static boolean isQueen(int[][] a, int row, int col){

        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
        // lớn nhất trên 8 hướng ?
        for (int i = 0; i<8; i++){
            // lớn nhất trên dx[i], dy[i] ?
            if (isMaxOnThisDirection(a, row, col, dx[i], dy[i]) == false)
                return false;
            // xử lý xong hướng dx[i],dy[i]
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int count = 0;

        int[][] a = new int[m][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();

            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (isQueen(a, i, j)) count ++;
            }
        }
        System.out.print(count);
        sc.close();
    }

}