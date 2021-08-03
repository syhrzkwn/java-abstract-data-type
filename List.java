package ADT;

public interface List {
    public void add(Object element);
    public void add(int index, Object element);
    public Object get(int index);
    public int size();
    public Object set(int index, Object element);
    public void clear();
    public boolean contains(Object element);
    public int indexOf(Object element);
    public boolean remove(Object element);
    public Object remove(int index);
}
