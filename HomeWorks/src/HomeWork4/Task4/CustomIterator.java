package HomeWork4.Task4;

import java.util.Iterator;

public class CustomIterator<T> implements Iterator<T> {
    private T[] array;
    private int index;
    private int size;
    public CustomIterator() {
        super();
    }
    public CustomIterator(T[] array, int size) {
        this.array = array;
        this.size = size;
    }
    @Override
    public boolean hasNext() {
        if (array == null || size <= index) {
            return false;
        }
        return true;
    }
    @Override
    public T next() {
        return array[index++];
    }
}