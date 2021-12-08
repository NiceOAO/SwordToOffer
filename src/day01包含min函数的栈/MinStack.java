package day01包含min函数的栈;

import java.util.Stack;

/**
 * 使用辅助栈 b 在存储时判断并存储最小值到 b，取值时直接从 b 的栈顶取即可
 */
public class MinStack {
    Stack<Integer> a ,b;

    /** initialize your data structure here. */
    public MinStack() {
        a = new Stack<>();
        b = new Stack<>();
    }

    public void push(int x) {
        a.push(x);
        if(b.empty() || b.peek() >= x){
            b.add(x);
        }
    }

    public void pop() {
        // a 出栈同时要判断 b 的栈顶是否需要出栈
        // peek 和 pop 的区别注意
        if(a.pop().equals(b.peek())){
            b.pop();
        }
    }

    public int top() {
        return a.peek();
    }

    public int min() {
        return b.peek();
    }
}
