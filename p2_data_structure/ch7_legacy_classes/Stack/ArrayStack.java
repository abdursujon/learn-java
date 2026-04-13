package ch7_legacy_classes.Stack;

import java.util.EmptyStackException;

public class ArrayStack implements Stacks {
    int top;
    Object[] stack;

    public ArrayStack(int initialCapacity){
        if(initialCapacity < 0){
            throw new IllegalArgumentException("Capacity must be >= 1");
        }
        stack = new Object[initialCapacity];
        top = -1;
    }

    public ArrayStack(){
        this(10);
    }

    @Override
    public boolean isEmpty() {
        return top == -1; // return true if list is empty
    }

    @Override
    public Object peek() {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return stack[top];
    }

    @Override
    public void push(Object theObject) {
        if(top == stack.length - 1){
            Object[] newArray = new Object[stack.length * 2];
            System.arraycopy(stack, 0, newArray, 0, stack.length);
            stack = newArray;
        }

        // Put the new element on top of the stack
        stack[++top] = theObject;
    }

    @Override
    public Object pop() {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        Object topObject = stack[top];
        stack[top--] = null; // allow garbage collection
        return topObject;
    }
}