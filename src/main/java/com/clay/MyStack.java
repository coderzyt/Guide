package com.clay;

import java.util.Stack;

/**
 * MyStack
 */
public class MyStack {

    private Stack<Integer> newStack;

    private Stack<Integer> stackMin;

    public MyStack() {
        newStack = new Stack<Integer>();
        stackMin = new Stack<Integer>();
    }

    public void push(int newNum) {
        if (stackMin.isEmpty()) {
            stackMin.push(newNum);
        }
        else if (newNum < getMin()) {
            stackMin.push(newNum);
        }
        this.newStack.push(newNum);
    }

    public int pop() {
        if (this.newStack.isEmpty()) {
            throw new RuntimeException("");
        }
        int value = this.newStack.pop();
        if (value == getMin()) {
            this.stackMin.pop();
        }
        return value;
    }

    public int getMin() {
        if (stackMin.isEmpty()) {
            throw new RuntimeException("");
        }
        return stackMin.peek();
    }
}