package ADT;

public class Queue <E> extends LinkedList <E> {
    public Queue() {}

    //insert data from behind
    public void enqueue(E element) {
        addLast(element);
    }

    //remove data from first or front
    public E dequeue() {
        return removeFirst();
    }

    //retrieve data from first or front
    public E getFront() {
        return getFirst();
    }
}
