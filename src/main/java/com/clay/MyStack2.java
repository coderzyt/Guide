package com.clay;

import java.util.Stack;

/**
 * MyStack2
 */
public class MyStack2 {

    private Stack<Integer> stackMin;

    private Stack<Integer> stackData;

    public MyStack2() {
        this.stackMin = new Stack<Integer>();
        this.stackData = new Stack<Integer>();
    }

    public void push(int value) {

        if (stackMin.isEmpty()) {
            stackMin.push(value);
        }
        else if (getMin() >= value) {
            stackMin.push(value);
        }
        else {
            stackMin.push(getMin());
        }
        stackData.push(value);
    }

    public int pop() {
        if (stackData.isEmpty()) {
            throw new RuntimeException();
        }
        stackMin.pop();
        return stackData.pop();
    }

    private int getMin() {
        if (stackMin.isEmpty()) {
            throw new RuntimeException();
        }
        return stackMin.peek();
    }
}