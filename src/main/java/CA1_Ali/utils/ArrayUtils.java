package CA1_Ali.utils;

import java.util.Arrays;

import static java.lang.Character.isLetterOrDigit;
import static java.lang.Character.toLowerCase;

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

    // ---------------------------------------------------------------------
    // PROBLEM 3: Shortest contiguous subarray with a sum of at least target

    /*
     * Brute-force approach:
     * Finds the shortest subarray whose sum is at least the target.
     * Returns the start and end indexes of that subarray.
     * If no such subarray exists, returns an array containing only 0.
     *
     * @param data   the input array of positive integers
     * @param target the target sum
     * @return an int[] with [startIndex, endIndex] or [0] if none exists
     */
    public static int [] shortestSubarrayBrute(int[] data, int target) {
        if (data == null) {
            throw new IllegalArgumentException("Cannot search a null arrya");
        }
        if (data.length==0) {
            return new int[]{0};
        }

        int shortestLength = data.length + 1;
        int bestStart = 0;
        int bestEnd = 0;

        for (int i=0; i<data.length; i++){
            int CurrentSum = 0;
            for (int j=i; j<data.length; j++){
                CurrentSum += data[j];
                if (CurrentSum >= target){
                    int length = j - i + 1;

                    if (length < shortestLength) {
                        shortestLength = length;
                        bestStart = i;
                        bestEnd = j;
                    }
                    break;
                }
            }
        }
        // If no valid subarray was found
        if (shortestLength == data.length + 1) {
            return new int[]{0};
        }

        return new int[]{bestStart, bestEnd};


    }


}
