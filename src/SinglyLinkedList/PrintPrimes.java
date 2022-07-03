package SinglyLinkedList;

import java.util.Scanner;

public class PrintPrimes {
    private static boolean isPrime(int n){
        if (n<2) return false;
        for (int i = 2; i*i <= n; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
    private static void printPrimes(MyLinkedList<Integer> lst){
        MyNode<Integer> curr;
        int count = 0;
        if (lst.head != null){
            curr = lst.head;
            while(curr != null){
                if (isPrime(curr.data)) count ++;
                curr = curr.next;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyLinkedList<Integer> lst = new MyLinkedList<>();
        int n;
        while(true){
            n = sc.nextInt();
            if (n==-1) break;
            lst.insertTail(n);
        }
        printPrimes(lst);
    }
}
