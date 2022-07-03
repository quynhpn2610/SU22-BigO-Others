package SinglyLinkedList;

import java.util.Scanner;

public class UnderAvg {
    private static void printUnderAvg(MyLinkedList<Double> lst) {
        MyNode<Double> curr;
        if (lst.head != null) {
            curr = lst.head;
            while (curr != null) {
                if (curr.data < 5.0) System.out.println(curr.data);
                curr = curr.next;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyLinkedList<Double> lst = new MyLinkedList<>();
        double n = 0;
        while (true){
           n = sc.nextDouble();
           if (n==-1) break;
           lst.insertTail(n);
        }
        printUnderAvg(lst);
    }
}
