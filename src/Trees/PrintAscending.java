package Trees;

import java.util.Scanner;

public class PrintAscending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BST tree = new BST();
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            tree.addToBST(val);
        }
        tree.printInorderBST();
        sc.close();
    }
}
