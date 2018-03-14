package com.exersize;

import java.util.Stack;

/**
 * TestStack2
 */
public class TestStack2 {

    private Stack<Integer> stackMin;

    private Stack<Integer> stackData;

    public TestStack2() {
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

    public int getMin() {
        if (stackMin.isEmpty()) {
            throw new RuntimeException();
        }
        return stackMin.peek();
    }
}