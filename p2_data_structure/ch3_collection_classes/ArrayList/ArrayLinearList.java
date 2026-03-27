package ArrayList;

import List.LinearList;

public class ArrayLinearList implements LinearList {

    // private — only the class itself can access it
    // protected — same as private, but subclasses and classes in the same package can also access it
    protected Object[] elementArray;
    protected int size;


//    public ArrayLinearList(){
//        elementArray = new Object[10];
//    }

    public ArrayLinearList(){
        this(10);
    }

    public ArrayLinearList(int initialSize){
        if(initialSize < 1){
            throw new IllegalArgumentException("Capacity must be >= 1");
        }
        elementArray = new Object[initialSize];
    }

    @Override
    public void add(int index, Object o) {
        checkIndex(index);
        if(size == elementArray.length){
            Object[] newArray = new Object[elementArray.length * 2];
            // starts at source 0, and destination 0, then copy the entire source to destination.
            System.arraycopy(elementArray, 0, newArray, 0, elementArray.length);
            elementArray = newArray;
        }

        for(int i = size - 1; i >= index; i--){
            elementArray[i + 1] = elementArray[i];
        }
        elementArray[index] = o;
        size++;
    }

    @Override
    public Object remove(int index) {
        checkIndex(index);
        Object removeElement = elementArray[index];
        for(int i = index + 1; i < size; i++){
            elementArray[i - 1] = elementArray[i];
        }
        elementArray[--size] = null;
        return removeElement;
    }

    public void checkIndex(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index " + index + " size = " + size);
        }
    }

    @Override
    public Object get(int index) {
        checkIndex(index);
        return elementArray[index];
    }


    @Override
    public int indexOf(Object o) {
       for(int i = 0; i < size; i++){
           if(elementArray[i].equals(0)){
               return i;
           }
       }
       return -1;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
      return size == 0; // == is a comparison operators , and = is an assignment operator
    }

    @Override
    public String outputList() {
        StringBuffer s = new StringBuffer("[");
        for(int i = 0; i < size; i++){
            if(elementArray[i] == null){
                s.append("null, ");
            }
            else{
                s.append(elementArray[i].toString() + ", ");
            }
        }

        if(size > 0){
            s.delete(s.length() - 2, s.length());
        }

        s.append("]");

        return  new String(s);
    }

    public static void main(String[] args){

    }
}
