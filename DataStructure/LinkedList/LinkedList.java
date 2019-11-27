package DataStructure.LinkedList;

/**
 ** Generic Linked List Implementation
 * 
 * @param <T>
 * @author Ken Morel, Javier Paez
 */

public class LinkedList<T> {
    class LinkedListNode {
        private T value;
        private LinkedListNode next;

        public LinkedListNode(T value) {
            this.value = value;
        }

        // *setters
        public void setValue(T value) {
            this.value = value;
        }

        public void setNext(LinkedListNode next) {
            this.next = next;
        }

        // *getters
        public T getValue() {
            return this.value;
        }

        public LinkedListNode getNext() {
            return this.next;
        }
    }

    private LinkedListNode head;
    private LinkedListNode tail;
    private int size;

    public LinkedList() {
        head = tail = null;
        size = 0;
    }

    // *getters
    public T getHead() {
        return head.getValue();
    }

    public T getTail() {
        return tail.getValue();
    }

    public int getSize() {
        return size;
    }

    /**
     ** Insert an element at the front of the list
     * 
     * @param value
     */

    public void addFront(T value) {
        LinkedListNode newNode = new LinkedListNode(value);
        if (size == 0)
            head = tail = newNode;
        else {
            newNode.setNext(head);
            head = newNode;
        }
        size++;
    }

    /**
     ** Retrieve and remove the element at the front of the list
     * 
     * @return T ret
     */

    public T removeFront() throws Exception {
        if (size == 0)
            throw new Exception();
        T ret = head.getValue();
        LinkedListNode tmp = head.getNext();
        head.setNext(null);
        head = tmp;
        size--;
        return ret;
    }

    /**
     ** Insert an element at the end of the list
     * 
     * @param value
     */

    public void addBack(final T value) {
        final LinkedListNode newNode = new LinkedListNode(value);
        if (size == 0)
            head = tail = newNode;
        else {
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;
    }

    /**
     ** Retrieve and remove the element at the end of the list
     * 
     * @return T ret
     */
    public T removeBack() throws Exception {
        if (size == 0)
            throw new Exception();
        T ret = tail.getValue();
        if (size == 1)
            head = tail = null;
        else {
            LinkedListNode current = head;
            while (current.next != tail)
                current = current.getNext();
            current.setNext(null);
            tail = current;
        }

        size--;
        return ret;
    }

}