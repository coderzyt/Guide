package com.clay;

import java.util.Stack;

/**
 * ReverseStack
 */
public class ReverseStack {

    private Stack<Integer> stack;

    private Stack<Integer> reverseStack;

    public ReverseStack() {
        this.stack = new Stack<Integer>();
        this.reverseStack = new Stack<Integer>();
    }

    public void reverse() {
        while (!stack.empty()) {
            reverseStack.push(stack.pop());
        }
    }

    public int reverse2() {
        if (!stack.empty()) {
            return stack.pop();
        }
        else {
            int result = reverse2();
            sta
        }
    }
}