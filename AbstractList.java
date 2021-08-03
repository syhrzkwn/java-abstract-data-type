package ADT;

public abstract class AbstractList implements List {

    protected int size = 0;
    protected AbstractList(){} /*default constructor*/

    protected AbstractList(Object[] elements){ /*Normal constructor*/
        for (int i=0; i<elements.length; i++)
            add(elements[i]); /*calling add()*/
    }

    public void add(Object element) { add(size, element); }

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){ return size; }

    public boolean remove(Object element) {
        if(indexOf(element) >= 0){
            remove(indexOf(element));
            return true;
        }
        else {
            return false;
        }
    }
}
