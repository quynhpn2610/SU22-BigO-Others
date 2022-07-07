package SinglyLinkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeleteEndW5 {
    private static void deleteEndW5(MyNode<Integer> node){
        MyNode<Integer> curr = node;
        while (curr != null){
            if (Math.abs(curr.data) % 10 != 5) {
                System.out.print(curr.data + " ");
            }
            curr = curr.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        MyNode<Integer> dummyHead = new MyNode<>(-1);
        MyNode<Integer> curr = dummyHead;
        for (int i = 0; i < n; i++) {
           int value = sc.nextInt();
           MyNode<Integer> node = new MyNode<>(value);
           curr.next = node;
           curr = curr.next;
        }
        deleteEndW5(dummyHead.next);
        sc.close();
    }
}
