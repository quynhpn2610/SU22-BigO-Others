package Review;

import java.util.Scanner;

public class FibLinkedList {
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

    static class MyLinkedList<T> {
        public MyNode<T> head;
        public MyNode<T> tail;

        public MyLinkedList(){
            head = null;
            tail = null;
        }

        public MyLinkedList(MyNode<T> head, MyNode<T> tail) {
            this.head = head;
            this.tail = tail;
        }


        protected void insertTail(T n){
            MyNode<T> node = new MyNode<>(n);

            if(this.head == null){
                this.head = node;
                this.tail = node;
            }
            else{
                this.tail.next = node;
                this.tail = node;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());
        int n = Integer.parseInt(sc.next());

        MyNode<Integer> first = new MyNode<>(x);
        MyNode<Integer> second = new MyNode<>(y);
        first.next = second;

        MyLinkedList<Integer> lst = new MyLinkedList<>(first, second);

        System.out.print(first.val + " ");

        for (int i = 1; i < n; i++) {
            System.out.print(y + " ");
            int next = x+y;
            next = next % 1000007;
            lst.insertTail(next);
            x = y;
            y = next;
        }
    }

}
