import java.lang.reflect.Array;

/**
 ** Queue Implementation
 * 
 * @param <T>
 * @author Javier Paez
 */
public class Queue<T> {
    private T[] arr;
    private int size;
    private int tail;
    private int head;

    public Queue(final Class<T> type) {
        this.size = 0;
        this.head = 0;
        this.tail = -1;
        arr = (T[]) Array.newInstance(type, 10);
    }

    /**
     ** Inserts the specified element into this queue if it is possible to do so
     ** immediately without violating capacity restrictions, returning true upon
     ** success and throwing an IllegalStateException if no space is currently
     ** available.
     * 
     * @param value - parameters of the method
     * 
     */
    public void enQueue(final T value) {
        if (size == arr.length) {
            resize(2 * arr.length);
        }
        tail++;
        arr[tail] = value;
        size++;
    }

    /**
     * *Return how many elements are in the queue
     * 
     * @return size
     */

    public int size() {
        return this.size;
    }

    /**
     ** Retrieves and removes the head of this queue.
     * 
     * @return head of the queue
     */
    public T deQueue() throws Exception {
        if (size == 0) {
            throw new Exception(); // ! Throw an exception if there's no element
        }
        T retValue = arr[head];
        head++;
        head %= arr.length;
        size--;
        return retValue;
    }

    /**
     * *Retrieves, but does not remove, the head of this queue, or returns null if
     * *this queue is empty.
     * 
     * @return head of the queue
     */
    public T peek() {
        return (size == 0 ? null : arr[head]);
    }

    /**
     * *Retrieves and removes the head of this queue, or returns null if this queue
     * *is empty.
     * 
     * @return head of the queue or null if queue is empty
     */
    public T poll() {
        if (size == 0)
            return null;

        final T retValue = arr[head];
        head++;
        head %= arr.length;
        size--;
        return retValue;
    }

    /**
     ** Resize the array when reach full capacity.
     * 
     * @param newCapacity
     * 
     */
    // TODO: implement
    private void resize(final int newCapacity) {

    }

}
