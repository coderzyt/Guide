package com.clay;

import java.util.LinkedList;

/**
 * BinarySearchST
 */
public class BinarySearchST<Key extends Comparable, Value> {

    private Key[] keys;

    private Value[] values;

    private int N;

    public int size() {
        return N;
    }

    public Value get(Key key) {
        if (isEmpty()) {
            return null;
        }
        return null;   
    }

    public boolean isEmpty() {
        return N == 0;
    }
}