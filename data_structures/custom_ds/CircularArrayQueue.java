import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class CircularArrayQueue<E> implements Queue<E> {
    Object[] queue;
    int front, rear;

    public CircularArrayQueue(int initialLength){
        if(initialLength < 1){
            throw new IllegalArgumentException();
        }
        queue = new Object[initialLength];
        front = rear = 0;
    }

    @Override
    public int size() {
        return 0;
    }

    public boolean isEmpty() {
        return front == rear;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] ts) {
        return null;
    }

    public void put(Object theObject) {
    }


    public E peek() {
        return null;
    }


    @Override
    public boolean add(E e) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> collection) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean offer(E e) {
        return false;
    }

    public E remove() {
        return null;
    }

    @Override
    public E poll() {
        return null;
    }

    @Override
    public E element() {
        return null;
    }
}
