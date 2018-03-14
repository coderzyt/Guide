package com.exersize;

import java.util.Stack;

/**
 * TestStack
 */
public class TestStack {

    private Stack<Integer> stackData;

    private Stack<Integer> stackMin;

    public TestStack() {
        this.stackData = new Stack<Integer>();
        this.stackMin = new Stack<Integer>();
    }

    public void push(int value) {
        if (stackMin.isEmpty()) {
            stackMin.push(value);
        }
        else if (getMin() >= value) {
            stackMin.push(value);
        }
        stackData.push(value);
    }

    public int pop() {
        if (stackData.isEmpty()) {
            throw new RuntimeException();
        }
        int value = stackData.pop();
        if (value == getMin()) {
            stackMin.pop();
        }
        return value;
    }

    public int getMin() {
        if (stackMin.isEmpty()) {
            throw new RuntimeException();
        }
        return stackMin.peek();
    }
}