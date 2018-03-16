package com.clay;

import java.util.Stack;

/**
 * ReverseStack
 */
public class ReverseStack {

<<<<<<< Updated upstream
=======
    private Stack<Integer> stack;

    public ReverseStack() {
        this.stack = new Stack<Integer>();
    }

>>>>>>> Stashed changes
    public static int getLastAndRemoveElement(Stack<Integer> stack) {
        int result = stack.pop();
        if (stack.empty()) {
            return result;
        }
<<<<<<< Updated upstream
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
=======
        else {
            int last = getLastAndRemoveElement(stack);
            System.out.println(last);
            stack.push(result);
            System.out.println(stack);
            return last;
        }
    }

    private static void reverse(Stack<Integer> stack) {
        if (stack.empty()) {
            return;
        }
        else {
            int i = getLastAndRemoveElement(stack);
            System.out.println(i);
            System.out.println(stack);
            reverse(stack);
            stack.push(i);
        }
>>>>>>> Stashed changes
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
<<<<<<< Updated upstream
        stack.push(5);
        System.out.println(stack);
=======
        // System.out.println(ReverseStack.getLastAndRemoveElement(stack));
>>>>>>> Stashed changes
        reverse(stack);
        System.out.println(stack);
    }
}