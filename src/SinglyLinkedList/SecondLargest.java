package SinglyLinkedList;

import java.util.Scanner;

public class SecondLargest {
    private static double findSecondMax(MyNode<Double> head){
        double max = Double.MIN_VALUE;
        MyNode<Double> curr = head;
        while(curr != null){
            if(curr.data > max){
                max = curr.data;
            }
            curr = curr.next;
        }

        // Find second max
        curr = head;
        double max2 = Double.MIN_VALUE;
        while(curr != null){
            if (curr.data > max2 && curr.data != max){
                max2 = curr.data;
            }
            curr = curr.next;
        }
        return max2 == Double.MIN_VALUE? -1 : max2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyNode<Double> dummyHead = new MyNode<>(-1.0);
        MyNode<Double> curr = dummyHead;
        MyNode<Double> node;

        while(true){
            String num = sc.next();
            if (num.equals("-1")) break;
            node = new MyNode<>(Double.parseDouble(num));
            curr.next = node;
            curr = curr.next;
        }
        System.out.println(findSecondMax(dummyHead.next));
        sc.close();
    }
}
