package Problem1;


public class MinStack extends ArrayStack<Integer> {
    // okay to add member variables
    // can only use Stack interface and ArrayStack from this folder
    // do not use Java Stack

    public MinStack(int size) {
        int min = Integer.MAX_VALUE;
        Stack<Integer> stack = new Stack<Integer>();
    }

    @Override
    public boolean push(Integer val) {
        if(x <= min){
            stack.push(min);
            min=x;
        }
        stack.push(x);
    }

    @Override
    public Integer pop() {
        if(stack.pop() == min) min=stack.pop();
        return -1; // place holder
    }

    public Integer getMin() {
        return min;

    }


 */

}

