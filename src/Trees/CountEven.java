package Trees;

import java.util.Scanner;

public class CountEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BST tree = new BST();
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            tree.addToBST(val);
        }
        tree.postOrderTraversalBST();
        sc.close();
    }
}
