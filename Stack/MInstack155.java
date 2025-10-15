package Stack;
import java.util.*;

public class MInstack155 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] input = s.nextLine().trim().split("\\s+");

        MinStack minStack = new MinStack();
        for (String cmd : input) {
            if (cmd.startsWith("push")) {
                int val = Integer.parseInt(cmd.split(":")[1]);
                minStack.push(val);
            } else if (cmd.equals("pop")) {
                minStack.pop();
            } else if (cmd.equals("top")) {
                System.out.println(minStack.top());
            } else if (cmd.equals("getMin")) {
                System.out.println(minStack.getMin());
            }
        }
    }
}

class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minstack;

    public MinStack() {
        stack = new Stack<>();
        minstack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if (minstack.isEmpty() || val <= minstack.peek()) {
            minstack.push(val);
        }
    }

    public void pop() {
        int popped = stack.pop();
        if (popped == minstack.peek()) {
            minstack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minstack.peek();
    }
}
