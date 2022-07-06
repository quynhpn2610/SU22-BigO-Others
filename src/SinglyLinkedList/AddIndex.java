package SinglyLinkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddIndex {
    private static void addIndex(List<Integer> nums){
        // check if nums is null
        if (nums.size() == 0){
            return;
        }


        // if nums has 1 element
        MyNode<Integer> head = new MyNode<>(1);
        MyNode<Integer> second = new MyNode<>(nums.get(0));
        head.next = second;

        if (nums.size() == 1){
            System.out.print(head.data + " " + second.data);
            return;
        }

        // if nums has more than 1 elements
        else {
            MyNode<Integer> curr;
            curr = second;
            int index = 1;
            for (int i = 1; i < nums.size(); i++) {
                MyNode<Integer> newNode = new MyNode<>(i+1);
                curr.next = newNode;
                curr = curr.next;
                MyNode<Integer> newNode2 = new MyNode<>(nums.get(i));
                curr.next = newNode2;
                curr = curr.next;
            }

            // Print out the whole thing
            curr = head;
            while (curr != null) {
                System.out.print(curr.data + " ");
                curr = curr.next;
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        // ArrayList to include Nodes
        List<Integer> nums = new ArrayList<>();
        while (true) {
            n = sc.nextInt();
            if (n == 0) break;
            nums.add(n);
        }
        addIndex(nums);

    }
}
