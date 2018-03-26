package com.clay;

/**
 * MyQuick3way
 */
public class MyQuick3way {

    public static void sort(Comparable[] aComparables) {
        sort(aComparables, 0, aComparables.length - 1);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        int lt = lo, i = lo + 1, gt = hi;
        Comparable v = a[lo];
        while (i <= gt) {
            int cmp = a[i].compareTo(v);
            if (cmp < 0) {
                exch(a, lt++, i++);
            }
            else if (cmp > 0) {
                exch(a, i, gt--);
            }
            else {
                i++;
            }
        }
        sort(a, lo, lt - 1);
        sort(a, gt + 2, hi);
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