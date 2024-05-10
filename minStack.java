import java.util.Stack;

public class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        // 如果minStack为空，或者x小于等于minStack栈顶，则将x压入minStack
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    public void pop() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("Cannot pop from empty stack.");
        }
        int popped = stack.pop();
        // 如果弹出的值是minStack栈顶，那么minStack也需要弹出
        if (popped == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }
        return stack.peek();
    }

    public int getMin() {
        if (minStack.isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }
        return minStack.peek();
    }
}


push(int x): 将元素压入主栈，如果该元素小于或等于最小栈的栈顶元素，则也压入最小栈。这确保最小栈始终保持栈的最小值。
pop(): 弹出主栈的元素，如果弹出的元素与最小栈的栈顶相同，则也从最小栈中弹出。这确保最小栈能保持栈的最小值。
top(): 返回主栈的栈顶元素。
getMin(): 返回最小栈的栈顶元素，即当前栈的最小值。

通过这种设计，push、pop、top和getMin操作都可以在O(1)时间复杂度内完成。





