package com.clay;

/**
 * Selection
 * 需要 N^2/2 次比较 和 N 次交换 
 */
public class Selection extends Chapter1 {

    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i+1; j < N; j++) {
                if (less(a[j], a[min])) {
                    min = j;
                }
                exch(a, i, min);
            }
        }
    }

    public static void main(String[] args) {
        Integer[] a = new Integer[8];
        a[0] = 5;
        a[1] = 3;
        a[2] = 6;
        a[3] = 10;
        a[4] = 9;
        a[5] = 22;
        a[6] = 7;
        a[7] = 1;
        sort(a);
        System.out.println(a);
    }
}