package ch3_collection_classes.LinkedList;

import List.LinearList;

public class LinearLinkedList implements LinearList{
    // LinkedList internally uses LinkedNode to implement it's feature, since it's in the same directory we don't need to import it
    protected LinkNode head;
    protected int size;

    public LinearLinkedList(){
        head = null;
    }

    @Override
    public void add(int index, Object theObject) {
        checkIndex(index);

        if(index == 0){
            head = new LinkNode(theObject, head);
        } else{
            LinkNode current = head;
            // Decides the position where to add the item.
            for(int i = 0; i < index -1 ; i++){
                current = current.next;
            }
            current.next = new LinkNode(theObject, current.next);
        }

        size++;

    }

    @Override
    public Object remove(int index) {
        checkIndex(index);
        Object removeObject;
        if(index == 0){
            removeObject = head.theObject;
            head = head.next;
        } else {
            LinkNode current = head;
            for(int i = 0; i< index - 1; i++){
                current = current.next;
            }
            removeObject = current.next.theObject;
            current.next = current.next.next;
        }
        size--;
        return removeObject;
    }

    public void checkIndex(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index: " + index + " size: " + size);
        }
    }

    @Override
    public Object get(int index) {
        checkIndex(index);
        LinkNode current;
        current = head;
        for(int i = 0; i < index; i++){
            current = current.next;
        }
        return current.theObject;
    }

    @Override
    public int indexOf(Object theObject) {
        //search for the element
        LinkNode current = head;
        int index = 0;
        while (current!= null && !current.theObject.equals(theObject))
        {
            current = current.next;//move to the next node
            index++;
        }
        if (current == null)// head is empty
            return -1;
        else
            return index;

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String outputList() {
        return "";
    }

    public static void main(String[] args){
        LinearLinkedList list = new LinearLinkedList();
        list.add(0, "Sujon");
        System.out.println(list.toString());
    }
}
