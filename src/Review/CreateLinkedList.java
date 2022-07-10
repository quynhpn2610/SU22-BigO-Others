package Review;

import java.util.Scanner;

public class CreateLinkedList {
    static class MyNode<T> {
        T val;
        MyNode<T> next;

        public MyNode(T val, MyNode<T> next) {
            this.val = val;
            this.next = next;
        }

        public MyNode(T val) {
            this.val = val;
        }
    }

    private static void printNewList(MyNode<Integer> head){
        MyNode<Integer> curr = head;
        System.out.print(curr.val + " ");
        while (curr.next != null){
            System.out.print(curr.val + curr.next.val + " ");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        MyNode<Integer> dummyHead = new MyNode<>(-1);
        MyNode<Integer> curr = dummyHead;
        MyNode<Integer> node;

        for (int i = 0; i < n; i++) {
            int input = sc.nextInt();
            node = new MyNode<>(input);
            curr.next = node;
            curr = curr.next;
        }

        printNewList(dummyHead.next);


    }
}
