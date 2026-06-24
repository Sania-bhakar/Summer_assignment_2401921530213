import java.util.*;

class MyQueue {

    Stack<Integer> stack;

    public MyQueue() {
        stack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
    }

    public int pop() {

        Stack<Integer> temp = new Stack<>();

        while(stack.size() > 1) {
            temp.push(stack.pop());
        }

        int front = stack.pop();

        while(!temp.isEmpty()) {
            stack.push(temp.pop());
        }

        return front;
    }

    public int peek() {

        Stack<Integer> temp = new Stack<>();

        while(stack.size() > 1) {
            temp.push(stack.pop());
        }

        int front = stack.peek();

        while(!temp.isEmpty()) {
            stack.push(temp.pop());
        }

        return front;
    }

    public boolean empty() {
        return stack.isEmpty();
    }
}