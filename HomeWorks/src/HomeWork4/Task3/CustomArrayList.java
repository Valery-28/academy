package HomeWork4.Task3;
import java.util.Iterator;
    public class CustomArrayList<T> {
        private static final int DEFAULT_CAPACITY = 16;
        private T[] array;
        private int index = -1;

        @SuppressWarnings("unchecked")
        public CustomArrayList() {
            super();
            array = (T[]) new Object[DEFAULT_CAPACITY];
        }

        @SuppressWarnings("unchecked")
        public CustomArrayList(int capacity) {
            super();
            this.array = (T[]) new Object[capacity];
        }

        public void add(T element) {
            if (array.length <= index + 1) {
                grow();
            }
            array[++index] = element;
        }

        @SuppressWarnings("unchecked")
        private void grow() {
            T[] newArray = (T[]) new Object[array.length * 2 + 1];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }

        public T get(int index) {
            return array[index];
        }

        public T getLast() {
            return index == -1 ? null : array[index];
        }

        public T getFirst() {
            return index == -1 ? null : array[0];
        }

        public int getCapacity() {
            return array.length;
        }

        public int getLastIndex() {
            return index;
        }

        public int getSize() {
            return index + 1;
        }

        public T remove(int index) {
            T temp = array[index];
            System.arraycopy(array, index + 1, array, index, this.index - index);
            array[this.index--] = null;
            return temp;
        }

        public T remove(T element) {
            for (int i = 0; i < array.length; i++) {
                if (array[i].equals(element)) {
                    return remove(i);
                }
            }
            return null;
        }

        public Iterator<T> iterator() {
            return new Iterator<T>() {
                int i;

                @Override
                public boolean hasNext() {
                    if (array == null || i >= index + 1) {
                        return false;
                    }
                    return true;
                }

                @Override
                public T next() {
                    return array[i++];
                }
            };
        }

    }
