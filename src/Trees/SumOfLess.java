package Trees;

import java.util.Scanner;

public class SumOfLess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        BST tree = new BST();

        for (int i = 0; i < n; i++) {
            int val = Integer.parseInt(sc.next());
            tree.addToBST(val);
        }

        System.out.println(tree.sumOfSmallerBST(x));

        sc.close();
    }
}
