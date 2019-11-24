package DataStructure.List;

import java.lang.reflect.Array;

/**
 ** Generic dynamic array implementation
 * @param <T>
 * @author Ken Morel
 */

public class List<T> {
    private T[] arr;
    private int size;
    private Class<T> type;

    public List(Class<T> type) {
        arr = (T[]) Array.newInstance(type, 2);
        this.type = type;
    }

    public List(Class<T> type, int capacity) {
        arr = (T[]) Array.newInstance(type, capacity);
        this.type = type;
    }

    /**
     ** Return how many elements are in the list
     * @return size
     */

    public int getSize() {
        return size;
    }

    /**
     * Return the dimensions of the list
     * @param length
     */

    public int getLength(){
        return arr.length;
    }

    /**
     ** Append an element at the end of the list
     * @param value
     */
    public void addBack(T value) {
        if (this.size == arr.length) resize(2*arr.length);
        arr[this.size++] = value;
    }

    /**
     ** Retrieve and remove the last element of the list
     * @return T ret
     */
    public T removeBack() throws Exception {
        if (this.size == 0) throw new Exception();
        T ret = arr[this.size - 1];
        this.size--;
        return ret;
    }

    /**
     ** Get a position of the list
     * @param pos
     * @return value
     */
    public T get(int pos) throws Exception {
        if (pos < 0 || pos >= this.size)
            throw new Exception();
        return arr[pos];
    }

    /**
     ** Insert an element at any given position
     * @param pos,value
     */
    public void insert(int pos, T value) throws Exception {
        if (pos < 0) throw new Exception();
        if (this.size == this.arr.length) resize(2*arr.length);
        for (int i = this.size-1; i>=0; i--) {
            this.arr[i+1] = this.arr[i];
        }
        this.arr[pos] = value;
        this.size++;
    }
    /**
     ** Check if the list contains a specific element
     * @param value
     * @return true (if the element exits) or false 
     */
    public boolean contains(T value) {
        for (T element : this.arr) {
            if (element == value) return true;
        }
        return false;
    }

    /**
     ** Resize the list when reach full capacity
     * @param newCapacity
     */
    private void resize(int newCapacity) {
        T[] newArray = (T[]) Array.newInstance(this.type, newCapacity);
        for (int i = 0; i < this.arr.length; i++) {
            newArray[i] = this.arr[i];
        }
        this.arr = newArray;
    }
    
}