package TwoDArrays;

import java.util.Scanner;

public class PrimesProductDiagonal2_05 {
    private static boolean isPrime(long n){
        if (n < 2) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int productDiagonalPrime(int[][] a){
        int product = 1;
        for (int i = 0; i < a.length; i++) {
            if(isPrime(a[i][a.length-1-i])) {
                product *= a[i][a.length-1-i];
                product %= 1000003;

            }
        }
        return (product % 1000003);
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
        System.out.println(productDiagonalPrime(a));
        sc.close();
    }
}
