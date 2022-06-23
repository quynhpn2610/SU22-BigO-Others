package DataAbstraction;

import java.util.Scanner;

public class FractionMain {
    public static void main(String[] args) {
        Fraction p1;
        Fraction p2;
        Fraction p3;

        int x, y;

        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        p1 = new Fraction(x, y);

        x = sc.nextInt();
        y = sc.nextInt();
        p2 = new Fraction(x, y);

        p3 = p1.sumFraction(p2);

        p1.reduceFraction();
        p2.reduceFraction();
        System.out.println(p3.toString());

    }
}
