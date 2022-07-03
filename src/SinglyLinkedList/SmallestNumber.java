package SinglyLinkedList;

import sun.awt.image.ImageWatched;

import java.util.LinkedList;
import java.util.Scanner;

public class SmallestNumber {
    public MyNode<Integer> findMin(LinkedList<Integer> lst){
        if(lst.head == null) return null;

        MyNode<Integer> min = head;
        MyNode<Integer> cur = head;

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
        LinkedList lst = new LinkedList();
        while(true){
            int n = sc.nextInt();
            if (n == 0) break;
            lst.insertTail(n);
        }
        Node ans = lst.findMin();
        System.out.println(ans.data);
        sc.close();
    }
}
