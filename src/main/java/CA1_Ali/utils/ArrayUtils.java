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

    //Problem 2
    //brute-face
    /**
     * Brute-force approach: filters the input to letters and digits,
     * converts uppercase letters to lowercase, then compares mirrored
     * characters in the filtered array
     *
     * This method treats only letters and digits
     * as characters to compare. It does not handle all Unicode letters.
     *
     * @param text the string to check
     * @return true if the considered characters form a palindrome; false otherwise
     */
    public static boolean isPalindromeBrute(String text) {
        if (text ==null) return false;
        char[] filtered = new char[text.length()];
        int count =0;
        for (int i = 0; i< text.length(); i++) {
            char ch = text.charAt(i);

            if (isLetterOrDigit(ch)) {
                filtered[count] = toLowerCase(ch);
                count++;
            }
        }
        for (int i=0; i<count/2; i++) {
            if (filtered[i] != filtered[count -1 -i]){
                return false;
            }
        }
        return true;
    }
}
