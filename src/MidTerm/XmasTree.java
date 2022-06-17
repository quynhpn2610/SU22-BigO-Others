package MidTerm;

import java.util.Scanner;

public class XmasTree {
    public static void xmasTree(int height) {
        // first for loop to print amount of rows
        for (int i = 0; i < height; i++) {
            // second for loop for print out spaces to match the tree level
            for (int j = 0; j < height-1-i; j++) {
                System.out.print(" ");
            }
            // third for loop to print out stars
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        xmasTree(n);
        sc.close();
    }
}
