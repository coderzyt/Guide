package com.clay;

/**
 * MaxPQ
 */
public class MaxPQ<Key extends Comparable<Key>> {

    private int N = 0;

    private Key[] queue;

    public MaxPQ() {
        
    }

    public MaxPQ(int maxCap) {
        queue = (Key[]) new Comparable[maxCap];
    }

    public MaxPQ(Key[] a) {
        this.queue = a;
    }

    public void Insert(Key v) {
        queue[++N] = v;
        swim(N);
    }

    public Key max() {
        return queue[1];
    }

    public Key delMax() {
        Key max = queue[1];
        exch(1, N--);
        queue[N+1] = null;
        sink(1);
        return max;
    }

    public boolean isEmpty() {
        return queue.length == 0;
    }

    public int size() {
        return queue.length;
    }

    private boolean less(int a, int b) {
        return queue[a].compareTo(queue[b]) < 0;
    }

    private void exch(int i, int j) {
        Key v = queue[i];
        queue[i] = queue[j];
        queue[j] = v;
    }

    private void swim(int k) {
        while (k > 1 && less(k/2, k)) {
            exch(k/2, k);
            k = k/2;
        }
    }

    private void sink(int k) {
        while (2 * k <= N) {
            int j = 2 * k;
            if (j < N && less(j, j+1)) {
                j++;
            }
            if (!less(k, j)) {
                break;
            }
            exch(k, j);
            k = j;
        }
    }
}