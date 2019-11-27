import DataStructure.LinkedList.LinkedList;;

/**
 ** Queue Implementation
 * 
 * @param <T>
 * @author Javier Paez,Ken Morel
 */
public class Queue<T> {
    private LinkedList<T> queue;

    public Queue() {
        queue = new LinkedList<T>();
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
        queue.addBack(value);
    }

    /**
     * *Return how many elements are in the queue
     * 
     * @return size
     */

    public int size() {
        return queue.getSize();
    }

    /**
     ** Retrieves and removes the head of this queue.
     * 
     * @return head of the queue
     */
    public T deQueue() {
        return (queue.getSize() == 0 ? null : queue.removeFront());
    }

    /**
     * *Retrieves, but does not remove, the head of this queue, or returns null if
     * *this queue is empty.
     * 
     * @return head of the queue
     */
    public T peek() {
        return (queue.getSize() == 0 ? null : queue.getHead());
    }

    /**
     * *Retrieves and removes the head of this queue, or returns null if this queue
     * *is empty.
     * 
     * @return head of the queue or null if queue is empty
     */
    public T poll() throws Exception {
        return queue.getSize() == 0 ? null : queue.removeFront();
    }

}
