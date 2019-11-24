package DataStructure.LinkedList;
/**
 ** Generic Linked List Implementation 
 * @param <T>
 * @author Ken Morel
 */

public class LinkedList<T> {
    class LinkedListNode {
        public T value;
        public LinkedListNode next;
        
        public LinkedListNode(final T value) {
            this.value = value;
        }
    }
    private LinkedListNode head;
    private LinkedListNode tail;
    private int size;

    public LinkedList() {
        head = tail = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    /**
     ** Insert an element at the front of the list
     * @param value
     */

    public void addFront(final T value) {
        final LinkedListNode newNode = new LinkedListNode(value);
        if (size == 0) 
            head = tail = newNode;
        else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    /**
     ** Retrieve and remove the element at the front of the list
     * @return T ret
     */

    public T removeFront() throws Exception {
        if (size == 0) throw new Exception();
        T ret = head.value;
        LinkedListNode tmp = head.next;
        head.next = null;
        head = tmp;
        size--;
        return ret;
    }

    /**
     ** Insert an element at the end of the list
     * @param value
     */

    public void addBack(final T value) {
        final LinkedListNode newNode = new LinkedListNode(value);
        if (size == 0) 
            head = tail = newNode;
        else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    /**
     ** Retrieve and remove the element at the end of the list
     * @return T ret 
     */
    public T removeBack() throws Exception {
        if (size == 0) throw new Exception();
        T ret = tail.value;
        if (size == 1)
            head = tail = null;
        else {
            LinkedListNode current = head;
            while (current.next != tail)
                current = current.next;
            current.next = null;
            tail = current;
        }

        size--;
        return ret;
    }
    
}