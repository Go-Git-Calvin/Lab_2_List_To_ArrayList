import java.util.*;
import java.util.List;

public class aList implements List {

    private ArrayList<Object> list;
    private static final int defaultSize = 10;
    private int maxSize;
    private int currSize;
    private int curr;

    public aList(int size) {

        maxSize = size;
        currSize = curr = 0;

        list = new ArrayList<Object>(size);

    }

    public aList() {

        list = new ArrayList<Object>();
        maxSize = defaultSize;
        currSize = curr = 0;
    }

    public void clear() {
        list.clear();
        currSize = curr = 0;
    }

    public boolean add(Object input) {

        list.add(input);
        currSize++;
        return true;
    }

    public void add(int index, Object element) {

        list.add(index, element);
        currSize++;
    }

    public boolean addAll(Collection c) {
        throw new UnsupportedOperationException("This method is not supported yet");
    }

    public boolean addAll(int index, Collection c) {
        throw new UnsupportedOperationException("This method is not supported yet");
    }

    public boolean contains(Object o) {
        if (list.contains(o) == true)
            return true;
        return false;
    }

    public boolean containsAll(Collection c) {
        throw new UnsupportedOperationException("This method is not supported yet");
    }

    public boolean equals(Object o) {
        if (list.equals(o) == true)
            return true;
        return false;
    }

    public Object get(int i) {
        return list.get(i);
    }

    public int hashCode() {
        throw new UnsupportedOperationException("This method is not supported yet");
    }

    public int indexOf(Object o) {
        throw new UnsupportedOperationException("This method is not supported yet");
    }

    public boolean isEmpty() {
        if (currSize == 0)
            return true;
        else
            return false;
    }

    public Iterator<Object> iterator() {
        throw new UnsupportedOperationException("This method is not supported yet");
    }

    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException("This method is not supported yet");
    }

    public ListIterator<Object> listIterator() {
        throw new UnsupportedOperationException("This method is not supported yet");
    }

    public ListIterator<Object> listIterator(int index) {
        throw new UnsupportedOperationException("This method is not supported yet");
    }

    public Object remove(int i) {
        if ((curr < 0) || (curr >= currSize))
            return null;
        list.remove(i);
        currSize--;
        return true;
    }

    public boolean remove(Object o) {
        if (currSize <= 0)
            return false;
        list.remove(o);
        currSize--;
        return true;
    }

    public boolean removeAll(Collection c) {
        throw new UnsupportedOperationException("This method is not supported yet");
    }

    public boolean retainAll(Collection c) {
        throw new UnsupportedOperationException("This method is not supported yet");
    }

    public Object set(int index, Object element) {
        throw new UnsupportedOperationException("This method is not supported yet");
    }

    public int size() {
        return list.size();
    }

    public List subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("This method is not supported yet");
    }

    public Object[] toArray() {
        throw new UnsupportedOperationException("This method is not supported yet");
    }

    public Object[] toArray(Object[] o) {
        throw new UnsupportedOperationException("This method is not supported yet");
    }

    public void trimToSize() {
        if (currSize < maxSize) {
            list.trimToSize();
            maxSize = currSize;
        }
    }
} // end of class
    