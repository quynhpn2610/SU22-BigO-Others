package SinglyLinkedList;

class MyLinkedList<T> {
    public MyNode<T> head;
    public MyNode<T> tail;

    public MyLinkedList(){
        head = null;
        tail = null;
    }

    protected void insertTail(T n){
        MyNode<T> node = new MyNode<>(n);

        if(this.head == null){
            this.head = node;
            this.tail = node;
        }
        else{
            this.tail.next = node;
            this.tail = node;
        }
    }
}
