package Task2;

import java.util.LinkedList;

public class LinkedQueue<E> implements Queue<E> {
    private LinkedList<E> list = new LinkedList<>();

    @Override
    public void enqueue(E element) {
        list.addLast(element);
    }

    @Override
    public E element() {
        return isEmpty() ? null : list.getFirst();
    }

    @Override
    public E dequeue() {
        return isEmpty() ? null : list.removeFirst();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void clear() {
        list.clear();
    }
}
