package TwoDArrays;
import java.util.*;
public class LikeCount_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] a = new int[m][n];
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
                if (a[i][j] > 100){
                    count ++;
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
}
