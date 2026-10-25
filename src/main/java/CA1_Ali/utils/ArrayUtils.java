package CA1_Ali.utils;

import java.util.Arrays;

public class ArrayUtils {

    /**
     * Brute-force approach:
     * Compares two integer arrays element-by-element in the same order.
     *
     * Conditions:
     * - If both arrays are null → they are equal.
     * - If one is null → not equal.
     * - If lengths differ → not equal.
     * - If any element at the same index differs → not equal.
     *
     * @param a the first array
     * @param b the second array
     * @return true if arrays are equal in the same order, false otherwise
     */
    public boolean equalsBrute(int[] a, int[] b) {
        if (a == null && b == null) return true;
        if (a == null || b == null) return false;

        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }

        return true;
    }

    /**
     * Two-pointer approach (order-insensitive):
     * Checks whether two arrays contain the same values, regardless of order.
     *
     * Steps:
     * - If both arrays are null → equal.
     * - If one is null → not equal.
     * - If lengths differ → not equal.
     * - Copy both arrays.
     * - Sort both copies.
     * - Compare sorted arrays element-by-element.
     *
     * @param a the first array
     * @param b the second array
     * @return true if arrays contain the same values in any order, false otherwise
     */
    public static boolean areArraysEqualTwoPointer(int[] a, int[] b) {
        if (a == null && b == null) return true;
        if (a == null || b == null) return false;

        if (a.length != b.length) return false;

        int[] aCopy = Arrays.copyOf(a, a.length);
        int[] bCopy = Arrays.copyOf(b, b.length);

        Arrays.sort(aCopy);
        Arrays.sort(bCopy);

        for (int i = 0; i < aCopy.length; i++) {
            if (aCopy[i] != bCopy[i]) return false;
        }

        return true;
    }
}
