package LinkedList;

public class LinkNode{
    protected Object theObject;
    protected LinkNode next;
   // protected LinkNode prev; we can use this to make LinkedList doubly linkedList

    public LinkNode(Object theObject, LinkNode next){
        this.theObject = theObject;
        this.next = next;
        //this.prev = prev;
    }
}