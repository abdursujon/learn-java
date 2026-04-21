package Queue;

public class CircularArrayQueue implements Queue{
    Object[] queue;
    int front, rear;

    public CircularArrayQueue(int initialLength){
        if(initialLength < 1){
            throw new IllegalArgumentException();
        }
        queue = new Object[initialLength];
        front = rear = 0;
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public void put(Object theObject) {
    }


    public Object peek() {
        return null;
    }


    public Object remove() {
        return null;
    }
}
