package com.clay;

/**
 * MyQuick2
 */
public class MyQuick2 {

    public static void sort(Comparable[] a) {
        sort(a,0, a.length - 1);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo + 10) {
            Insertion.sort(a);
        }
        int partition = paitition(a, lo, hi);
        sort(a, lo, partition - 1);
        sort(a, partition, hi);
    }

    private static int paitition(Comparable[] a, int lo, int hi) {
        int i = lo, j = hi + 1;
        Comparable v = a[lo];
        while (true) {
            while (less(a[++i], v)) {
                if (i == hi) {
                    break;
                }
            }
            while (less(v, a[--j])) {
                if (j == lo) {
                    break;
                }
            }
            if (i >= j) {
                break;
            }
            exch(a, i, j);
        }
        exch(a, lo, j);
        return j;
    }

    private static boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable v = a[i];
        a[i] = a[j];
        a[j] = v;
    }
}