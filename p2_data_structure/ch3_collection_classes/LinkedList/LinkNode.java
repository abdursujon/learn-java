package ch3_collection_classes.LinkedList;

public class LinkNode{
    public Object theObject;
    public LinkNode next;
   // protected LinkNode prev; we can use this to make LinkedList doubly linkedList

    public LinkNode(Object theObject, LinkNode next){
        this.theObject = theObject;
        this.next = next;
        //this.prev = prev;
    }
}