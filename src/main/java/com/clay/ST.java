package com.clay;

import java.awt.RenderingHints.Key;
import java.util.Iterator;

/**
 * ST<Key, Value>
 */
public class ST<Key extends Comparable, Value> implements Iterable<Key> {

    public ST() {}

    public void put(Key key, Value value) {

    }

    public Value get(Key key) {

    }

    public void delete(Key key) {
        put(key, null);
    }

    public boolean contains(Key key) {
        return !(get(key) == null);
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int size() {

    }

    public int size(Key lo, Key hi) {
        if (lo.compareTo(hi) > 0) {
            return 0;
        }
        else if (contains(hi)) {
            return rank(hi) - rank(lo) + 1;
        }
        else {
            return rank(hi) - rank(lo);
        }
    }

    public Iterable<Key> keys() {
        return keys(min(), max());
    }

    public Iterable<Key> keys(Key lo, Key hi) {

    }

    public Key min() {

    }

    public Key max() {

    }

    public Key floor(Key key) {

    }

    public Key celling(Key key) {

    }

    public int rank(Key key) {

    }

    public Key select(int k) {

    }

    public void deleteMin() {
        delete(min());
    }

    public void deleteMax() {
        delete(max());
    }


	@Override
	public Iterator<Key> iterator() {
		return null;
	}
    
}