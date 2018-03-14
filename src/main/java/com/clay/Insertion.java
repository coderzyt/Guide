package com.clay;

/**
 * Insertion
 * 平均情况 N^2/4 次比较 N^2/4 次交换
 * 最坏情况 N^2/2 次比较 N^2/2 次交换
 * 最好情况 N-1   次比较 0     次交换
 */
public class Insertion extends Chapter1 {

    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++) {
            int j = i;
            while (j > 0) {
                if (less(a[j], a[j - 1])) {
                    exch(a, j, j-1);
                }
                j--;
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