package SinglyLinkedList;

import sun.awt.image.ImageWatched;

import java.util.LinkedList;
import java.util.Scanner;

public class SmallestNumber {
    public static MyNode<Integer> findMin(MyLinkedList<Integer> lst){
        if(lst.head == null) return null;

        MyNode<Integer> min = lst.head;
        MyNode<Integer> cur = lst.head;

        while(cur != null){ // traverse until the end
            if (cur.data < min.data){
                min = cur;
            }
            cur = cur.next; // move pointer (i++)
        }

        return min;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyLinkedList<Integer> lst = new MyLinkedList<>();
        while(true){
            int n = sc.nextInt();
            if (n == 0) break;
            lst.insertTail(n);
        }
        MyNode<Integer> ans = findMin(lst);
        System.out.println(ans.data);
        sc.close();
    }
}
