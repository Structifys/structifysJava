import DataStructure.LinkedList.LinkedList;

/**
 * *Stack implementation
 * 
 * @param <T>
 * @author Javier Paez
 */
public class Stack<T> {
    private LinkedList<T> stack;

    public Stack() {
        stack = new LinkedList<T>();
    }

    /**
     ** Pushes an item onto the top of this stack.
     * 
     * @param Value
     */
    public void push(T Value) {
        stack.addBack(Value);
    }

    /**
     * Pop the element at the top of the stack
     * 
     * @return top
     */
    public T pop() throws Exception {
        return stack.getSize() == 0 ? null : stack.removeBack();
    }

    /**
     ** Retrieve the top of the stack
     * 
     * @return top
     */
    public T peek() {
        return stack.getSize() == 0 ? null : stack.getTail();
    }

    /**
     ** Return how many elements are in the stack
     * 
     * @return size
     */
    public int size() {
        return stack.getSize();
    }

    /**
     ** Check if the stack is empty.
     * 
     * @return size
     */
    public boolean Empty() {
        return stack.getSize() == 0 ? true : false;
    }

}
