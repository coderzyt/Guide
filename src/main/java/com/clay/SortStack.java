package com.clay;

import java.util.Stack;

import javax.swing.text.StyleConstants;

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
}