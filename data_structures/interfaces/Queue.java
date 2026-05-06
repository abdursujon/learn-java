package interfaces;

import java.util.Collection;
import java.util.Iterator;

public interface Queue<E> extends Collection<E> {

    // Inserts element into queue
    boolean add(E e);
    boolean offer(E e);

    // Removes and returns front element
    E remove();
    E poll();

    // Returns front element without removing
    E element();
    E peek();

    // Inherited from Collection:
    int size();
    boolean isEmpty();
    boolean contains(Object o);
    Iterator<E> iterator();
    Object[] toArray();
    <T> T[] toArray(T[] a);
    boolean remove(Object o);
    boolean containsAll(Collection<?> c);
    boolean addAll(Collection<? extends E> c);
    boolean removeAll(Collection<?> c);
    boolean retainAll(Collection<?> c);
    void clear();
}