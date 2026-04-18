package ch7_legacy_classes.Stack;

import ch3_collection_classes.LinkedList.LinkNode;
import java.util.EmptyStackException;

public class LinkedStack implements Stacks {
    protected LinkNode top;

    public LinkedStack(){
        top = null;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public Object peek() {
       if(isEmpty()) throw new EmptyStackException();
       return top.theObject;
    }

    @Override
    public void push(Object theObject) {
        top = new LinkNode(theObject, top);
    }

    @Override
    public Object pop() {
        if(isEmpty()) throw new EmptyStackException();
        Object topObject = top.theObject;
        top = top.next;
        return topObject;
    }

    public static void main(String[] args){
        LinkedStack s = new LinkedStack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isEmpty()){
            System.out.println("Top element is " + s.peek());
            System.out.println("Removed item is " + s.pop());
        }

        System.out.println(s.isEmpty());
    }

}
