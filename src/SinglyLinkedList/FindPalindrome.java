package SinglyLinkedList;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindPalindrome {
    private static boolean isSymmetric(String s){
        if (s.length() == 1) return true;
        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length()-1-i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyNode<Integer> dummyHead = new MyNode<>(1);
        MyNode<Integer> curr = dummyHead;
        MyNode<Integer> node;
        Map<MyNode<Integer>, Integer> map = new HashMap<>();
        int index = 0;

        while(true){
            // get user input
            int input = Integer.parseInt(sc.next());
            if (input == -1) break;
            node = new MyNode<>(input);
            curr.next = node;
            curr = curr.next;
            map.put(node, index);
            index ++;
        }
        // traverse the linked List
        curr = dummyHead.next;
        while(curr != null){
            if(isSymmetric(curr.data.toString())){
                System.out.print(map.get(curr) + " ");
            }
            curr = curr.next;
        }

        sc.close();
    }
}
