package com.clay;

import java.util.Stack;

/**
 * SortStack
 */
public class SortStack {

    // private Stack<Integer> stack;

    // private Stack<Integer> help;

    // public SortStack() {
    //     this.stack = new Stack<Integer>();
    //     this.help = new Stack<Integer>();
    // }

    public int getMinAndRemoveElement(Stack<Integer> help, Stack<Integer> stack) {
        if (stack.isEmpty()) {
            throw new RuntimeException();
        }
        int min = stack.peek();
        while (!stack.isEmpty()) {
            int result = stack.pop();
            if (result < min) {
                min = result;
            }
            help.push(result);
        }
        return min;
    }

    public void sort(Stack<Integer> stack) {
        
    }

    public static void sortStackByStack(Stack<Integer> stack) {
        Stack<Integer> help = new Stack<Integer>();
        while (!stack.isEmpty()) {
            int cur = stack.pop();
            while (!help.isEmpty() && help.peek() > cur) {
                stack.push(help.pop());
            }
            help.push(cur);
        }
        while (!help.isEmpty()) {
            stack.push(help.pop());
        }
    }
}