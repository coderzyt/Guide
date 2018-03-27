package com.clay;

/**
 * IndexMinPQ
 */
public class IndexMinPQ<Item extends Comparable> {

    private Item[] pq;

    public IndexMinPQ(int maxN) {
        pq = (Item[]) new Comparable[maxN];
    }

    public void insert(int k, Item item) {

    }

    public void change(int k, Item item) {

    }

    public boolean contains(int k) {

    }

    public void delete(int k) {

    }

    public Item min() {

    }

    public int minIndex() {

    }

    public int delMin() {

    }

    public boolean isEmpty() {
        return pq.length == 0;
    }

    public int size() {
        return pq.length;
    }
}