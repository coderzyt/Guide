package com.clay;


/**
 * MergeBU
 */
public class MergeBU {

    public static void sort(Comparable[] a) {
        int N = a.length;
        Comparable[] aux = new Comparable[N];
        for (int i = 1; i < N; i = i + i) {
            for (int lo = 0; lo < N - i; lo += i + i) {
                merge(a, aux, lo, lo + i - 1 , Math.min(lo + i + i - 1, N - 1));
            }
        }
    }

    public static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi) {
        for (int i = lo; i <= hi; i++) {
            aux[i] = a[i];
        }

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

    private static boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) > 0;
    }
}