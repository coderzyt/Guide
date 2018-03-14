package com.clay;

import java.util.Stack;

/**
 * MyQueue
 */
public class MyQueue {

    private Stack<Integer> stackPush;

    private Stack<Integer> stackPop;

    public MyQueue() {
        this.stackPush = new Stack<Integer>();
        this.stackPop = new Stack<Integer>();
    }

    public void add(int value) {
        stackPush.push(value);
    }

    public int poll() {
        if (stackPop.empty() && stackPush.empty()) {
            throw new RuntimeException();
        }
        else if (stackPop.empty()) {
            while (!stackPush.empty()) {
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.pop();
    }

    public int peek() {
        if (stackPop.empty() && stackPush.empty()) {
            throw new RuntimeException();
        }
        else if (stackPop.empty()) {
            while (!stackPush.empty()) {
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.peek();
    }

}