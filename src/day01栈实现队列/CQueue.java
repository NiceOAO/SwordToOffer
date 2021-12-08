package day01栈实现队列;

import java.util.LinkedList;

public class CQueue {
    LinkedList<Integer> a, b;
    public CQueue() {
        a = new LinkedList<>();
        b = new LinkedList<>();
    }

    public void appendTail(int value) {
        a.addLast(value);
    }

    public int deleteHead() {
        if(!b.isEmpty()){
            return b.removeLast();
        }
        if(a.isEmpty()){
            return -1;
        }
        while (!a.isEmpty()){
            b.addLast(a.removeLast());
        }
        return b.removeLast();
    }
}
