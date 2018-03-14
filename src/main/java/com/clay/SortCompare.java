package com.clay;

/**
 * SortCompare
 */
public class SortCompare {

    public static double time(String alg, Comparable[] a) {

        long beginningTime = System.currentTimeMillis();
        if (alg.equals("Insertion")) {
            Insertion.sort(a);
        }
        else if (alg.equals("Selection")) {
            Selection.sort(a);
        }
        else if (alg.equals("Shell")) {
            Shell.sort(a);
        }


        return System.currentTimeMillis() - beginningTime;
    }
}