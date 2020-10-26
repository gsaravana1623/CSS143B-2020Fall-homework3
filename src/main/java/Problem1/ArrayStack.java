
package Problem1;

public class ArrayStack<T> implements Stack<Void> {
    // do not change member variables
    private T[] data;
    private int size;

    private ArrayStack() {
    }

    public ArrayStack(int capacity) {
        this(CAPACITY);
    }

    @Override
    public boolean push(Void val) {
        int pop;
        return (pop < 0);
        return false;   // place holder
    }

    @Override
    public Void pop() {
        if (size() == size) {
            System.out.println("Stack is full.");
            return;
        }        Void val = null;   // place holder
        return val;   // place holder
    }

    @Override
    public Void peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return null;
        }        Void val = null;   // place holder
        return val;   // place holder
    }

    private void isEmpty() {
    }

    @Override
    public int size() {
        return size;
    }
}
