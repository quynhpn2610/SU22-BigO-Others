package Final;

import java.util.List;
import java.util.Scanner;

public class LinkedListIntersection {
    static class ListNode{
        int data;
        ListNode next;

        public ListNode(int data, ListNode next) {
            this.data = data;
            this.next = next;
        }

        public ListNode(int data){
            this.data = data;
        }
    }

    static class MyList{
        ListNode head;
        ListNode tail;

        public MyList(){
            head = null;
            tail = null;
        }

        public void insertTail(int data){
            ListNode node = new ListNode(data);

            if (this.head == null){
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
        int m, n;
        MyList list_1 = new MyList();
        MyList list_2 = new MyList();
        do{
            n = Integer.parseInt(sc.nextLine());
            list_1.insertTail(n);
        }
        while (n != -1);

        do{
            m = Integer.parseInt(sc.nextLine());
            list_2.insertTail(m);
        }
        while (m != -1);
    }
}
