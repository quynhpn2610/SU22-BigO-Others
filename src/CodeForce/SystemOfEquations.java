package CodeForce;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class SystemOfEquations {
    private static int pairOfIntCalc(int n, int m){
        int pairNum = 0;
        for (int a = 0; a * a <= n && a <= m; a++)
        {
            int b = n - a * a;
            if (a + b * b == m)
            {
                pairNum += 1;
            }
        }
        return pairNum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(pairOfIntCalc(a, b));
        sc.close();
    }
}
