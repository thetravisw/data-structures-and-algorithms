package OldStuff.Whiteboard_14_MaxStack;

import java.util.Stack;

public class max extends Stack<Integer> {
    private Stack<Integer> maxval = new Stack<Integer>();

    public int max() {
        if (maxval.isEmpty()) {
            return Integer.MIN_VALUE;
        } else {
            return maxval.peek();
        }
    }

    public void push(int value){
        if (value >= max()) {
            maxval.push(value);
        }
        super.push(value);
    }

    public Integer pop() {
        int value = super.pop();

        if (value == max()) {
            maxval.pop();
        }
        return value;
    }
}
