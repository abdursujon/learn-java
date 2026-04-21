package Stack;

import List.LinkNode;
import java.util.EmptyStackException;

public class LinkedStack implements Stack{
    LinkNode top;

    public LinkedStack(){
        top = null;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public Object pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        Object theObject = top.theObject;
        top = top.next;
        return theObject;
    }

    public void push(Object theObject){
        top = new LinkNode(theObject, top);
    }

    public Object peek(){
        return top.theObject;
    }

    public static void main(String[] args){
        LinkedStack ls = new LinkedStack();
        ls.push(88);
        System.out.println(ls.peek());
        System.out.println(ls.isEmpty());
        System.out.println(ls.pop());
        System.out.println(ls.isEmpty());
    }
}