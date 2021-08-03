package ADT;

public class Stack<E> extends LinkedList<E> {
    public Stack() {}

    //insert data in stack
    public void push(E element) {
        addLast(element);
    }

    //remove data in stack
    public E pop() {
        return removeLast();
    }

    //retrieve data in stack at the top
    public E peek() {
        return getLast();
    }
}
