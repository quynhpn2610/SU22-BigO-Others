package SinglyLinkedList;

import java.util.Scanner;

public class PerformOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        // 0
        // case 1: top == null -> do nothing
        // case 2: 1. top != null && top.next = null -> top = null
        // case 2: 2. top != null && top.next != null -> top = top.next
        // 1
        // if top == null && tail == null -> top = newNode tail = newNode
        // else, tail = newNode, tail = tail.next
        MyNode<Integer> top = null;
        MyNode<Integer> tail = top;
        for (int i = 0; i < n; i++) {
            int operation = Integer.parseInt(sc.next());
            if (operation == 0){
                if (top != null) {
                    if (top.next == null) {
                        top = null;
                    }
                    else {
                        top = top.next;
                    }
                }
            }
            if (operation == 1){
                int val = Integer.parseInt(sc.next());
                MyNode<Integer> node = new MyNode<>(val);
                if (top == null){
                    top = node;
                }
                if (tail == null) {
                    tail = node;
                }
                else{
                    tail.next = node; //insert new node to after tail
                    tail = tail.next; //move pointer to new tail
                }
            }
        }
        MyNode<Integer> curr = top;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        sc.close();
    }
}
