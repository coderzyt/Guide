package com.clay;

/**
 * Merge
 */
public class Merge {

    private static int[] aux;

    public static void sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            aux[i] = a[i];
        }
        int lo = 0;
        int hi = a.length - 1;
        sort(a, lo, hi);
    }

    private static void sort(int[] a, int lo, int hi) {
        if (lo >= hi) {
            return;
        }
        int mid = lo + (hi - lo) / 2;
        sort(a, lo, mid);
        sort(a, mid + 1, hi);
        merge(a, lo, mid, hi);
    }

    private static void merge(int[] a, int lo, int mid, int hi) {
        int i = lo;
        int j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                a[k] = aux[j++];
            }
            else if (j > hi) {
                a[k] = aux[i++];
            }
            else if (less(aux[i], aux[j])) {
                a[k] = aux[j++];
            }
            else {
                a[k] = aux[i++];
            }
        }
    }

    private static boolean less(int a, int b) {
        return a > b;
    }
}