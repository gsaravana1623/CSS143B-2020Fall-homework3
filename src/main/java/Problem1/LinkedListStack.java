package Problem1;

import java.util.LinkedList;

public class LinkedListStack<T> implements Stack<T> {
    // use Java LinkedList to store the data
    // do not change member variables
    private LinkedList<T> data;

    public LinkedListStack() {
        // homework
    }

    @Override
    public boolean push(T val) {
        return false;   // place holder
    }

    @Override
    public T pop() {
        if(top == 0) {

            throw new StackUnderflowException("Not enough elements");

            return null;

        }

        return stackArray[--top];
    }

    @Override
    public T peek() {
        if(top == INITIAL_LENGTH) {

            throw new StackOverflowException("Stack full");

        }

        stackArray[++top] = elem;

    }
    }

    @Override
    public int size() {
        return data.size();
    }
}
