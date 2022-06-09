package TwoDArrays;

import java.util.Scanner;

public class PrimesOnBorder_03 {
    private static boolean isPrime(int n){
        if (n<2) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static int findPrimesOnBorder(int[][] a){
        int count = 0;
        for (int j = 0; j<a[0].length; j++){
            if (isPrime(a[0][j])){
                count ++;
            }
            if (isPrime(a[a.length-1][j])){
                count ++;
            }
        }
        for (int i = 1; i < a.length-1; i++) {
            if (isPrime(a[i][0])){
                count ++;
            }

            if (isPrime(a[i][a[0].length-1])){
                count ++;
            }
        }
        return count;
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

        System.out.println(findPrimesOnBorder(a));

        sc.close();

    }
}
