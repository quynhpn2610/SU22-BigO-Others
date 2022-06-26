package DataAbstraction;

import java.util.Scanner;

public class LargestFraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Fraction f;
        int x, y;
        Fraction[] arr = new Fraction[n];

        for (int i = 0; i < n; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            f = new Fraction(x, y);
            arr[i] = f;
        }
        Fraction max = new Fraction(0,1);

        for (Fraction fr:
             arr) {
            fr.reduceFraction();
            if (fr.greaterThan(max)){
                max = fr;
            }
        }
        System.out.println(max);
        
        sc.close();
        
    }
}
