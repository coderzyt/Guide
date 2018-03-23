package com.clay;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

/**
 * ReverseStack
 */
public class ReverseStack {

    private Stack<Integer> stack;

    public ReverseStack() {
        this.stack = new Stack<Integer>();
    }

    public static int getLastAndRemoveElement(Stack<Integer> stack) {
        int result = stack.pop();
        if (stack.empty()) {
            return result;
        }
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
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        // System.out.println(ReverseStack.getLastAndRemoveElement(stack));
        reverse(stack);
        System.out.println(stack);
        Set<String> stringHashSet = new HashSet<String>();
        Set<String> stringTreeSet = new TreeSet<String>();
        List<String> stringArrayList = new ArrayList<String>();
        List<String> stringLinkedList = new LinkedList<String>();
        Map<String, String> stringHashMap = new HashMap<>();
        Thread.yield();
    }
}