package List;
public interface LinearList{
    // add
    public void add(int index, Object o);

    // remove
    public Object remove(int index);

    // get
    public Object get(int index);

    // indexOf
    public int indexOf(Object o);

    // size
    public int size();

    // isEmpty
    public boolean isEmpty();

    // outputList
    public String outputList();
}