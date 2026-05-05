package Queue;

public interface Queue {
    public boolean isEmpty();
    public void put(Object theObject);
    public Object peek();
    public Object remove();
}
