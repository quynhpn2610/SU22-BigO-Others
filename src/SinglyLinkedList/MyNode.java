package SinglyLinkedList;

class MyNode<T>{
    T data;
    MyNode<T> next;

    public MyNode(T data, MyNode<T> next) {
        this.data = data;
        this.next = next;
    }

    public MyNode(T data) {
        this.data = data;
    }
}
