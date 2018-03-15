package com.clay;

import java.util.Stack;

/**
 * ReverseStack
 */
public class ReverseStack {

    public static int getLastAndRemoveElement(Stack<Integer> stack) {
        int result = stack.pop();
        if (stack.empty()) {
            return result;
        }
        int last = getLastAndRemoveElement(stack);
        stack.push(result);
        return last;
    }

    public static void reverse(Stack<Integer> stack) {
        if (stack.empty()) {
            return;
        }
        int last = getLastAndRemoveElement(stack);
        reverse(stack);
        stack.push(last);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
        reverse(stack);
        System.out.println(stack);
    }
}