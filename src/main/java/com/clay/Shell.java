package com.clay;

/**
 * Shell
 */
public class Shell extends Chapter1 {

    public static void sort(Comparable[] a) {
        // 将a[]按升序排列
        int N = a.length;
        int h = 1;
        while (h < N/3) {
            h = 3 * h + 1;
        }
        while (h >= 1) {
            // 将数组变为h有序
            for (int i = h; i < N; i++) {
                // 将a[i]插入到a[i-h], a[i-2*h], a[i-3*h]... 之中
                for (int j = i; j >= h && less(a[j], a[j-h]); j -= h) {
                    exch(a, j, j-h);
                }
            }
            h = h/3;
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