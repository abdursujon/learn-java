package Stack;

import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayStack implements Stack {
  Object[] stack;
  int top;

  public ArrayStack(int initialLength) {
    if (initialLength < 1) {
      throw new IllegalArgumentException("Initial length must be >= 1");
    }
    stack = new Object[initialLength];
    top = -1;
  }

  public ArrayStack() {
    this(10);
  }

  public boolean isEmpty() {
    return top == -1;
  }

  public void push(Object theObject) {
    // if the stack full double the size
    if (top == stack.length - 1) {
      Object[] newArrayStack = new Object[stack.length * 2];
      System.arraycopy(stack, 0, newArrayStack, 0, stack.length);
      stack = newArrayStack;
    }
    stack[++top] = theObject;
  }

  public Object peek() {
    if (isEmpty()) {
      throw new EmptyStackException();
    }
    return stack[top];
  }

  public Object pop() {
    if (isEmpty()) {
      throw new EmptyStackException();
    }
    Object theObject = stack[top];
    stack[top--] = null;
    return theObject;
  }

  @Override
  public String toString(){
    return Arrays.toString(Arrays.copyOf(stack, top + 1));
  }

  public static void main(String[] args){
    Stack s = new ArrayStack();
    s.push("My name is sujon");
    s.push(88);
    s.isEmpty();
    s.peek();
    s.pop();
    System.out.println(s);
  }
}
