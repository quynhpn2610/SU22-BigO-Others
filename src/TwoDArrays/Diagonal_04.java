package TwoDArrays;

import java.util.Scanner;

public class Diagonal_04 {
    private static boolean isPrime(int n){
        if (n < 2) return false;

        for (int i = 2; i <= (double)(Math.sqrt(n)); i++) {
            if (n % i == 0) return false;
        }

        return true;
    }

    public static int countDiagonalPrime(int[][] a){
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if(isPrime(a[i][i])) {
                count ++;
            }
        }
        return count;
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
        System.out.println(countDiagonalPrime(a));


        sc.close();
    }
}
