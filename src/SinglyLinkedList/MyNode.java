package SinglyLinkedList;

public class MyNode<T>{
    T data;
    MyNode<T> next;

    public MyNode(T data, MyNode<T> next){
        this.data = data;
        next = null;
    }

    public MyNode(T data){
        this.data = data;
        this.next = null;
    }

}
