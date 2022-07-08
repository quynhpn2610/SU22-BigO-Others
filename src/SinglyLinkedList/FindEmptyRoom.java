package SinglyLinkedList;

import java.util.Scanner;

public class FindEmptyRoom {
    static class Room{
        String id;
        int price;
        boolean isEmpty;

        public Room(String id, int price, int status){
            this.id = id;
            this.price = price;
            this.isEmpty = status == 0;
        }

        public Room(){
        }

        @Override
        public String toString(){
            return id + " " + price;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        MyNode<Room> dummyHead = new MyNode<>(new Room());
        MyNode<Room> curr = dummyHead;
        for (int i = 0; i < n; i++) {
            String id = sc.next();
            int price = sc.nextInt();
            int status = sc.nextInt();
            Room room = new Room(id, price, status);
            curr.next = new MyNode<>(room);
            curr = curr.next;
        }
        curr = dummyHead.next;
        while (curr != null){
            if(curr.data.isEmpty){
                System.out.println(curr.data);
            }
            curr = curr.next;
        }
        sc.close();

    }
}
