package CA1_Ali.utils;

public class StringUtils {
    /**
     * Checks whether a character is a letter or digit.
     *
     * @param c the character to check
     * @return true if the character is an alphanumeric letter or digit, false otherwise
     */
    public static boolean isLetterOrDigit(char c) {
        // Check if it's a lowercase letter
        boolean isLowercase = (c >= 'a' && c <= 'z');

        // Check if it's an uppercase letter
        boolean isUppercase = (c >= 'A' && c <= 'Z');

        // Check if it's a number digit
        boolean isDigit = (c >= '0' && c <= '9');

        // If it is any of these three, return true
        return isLowercase || isUppercase || isDigit;
    }
    /**
     * Converts an upper case letter to lower case (all other characters are unchanged).
     * @param c the character to convert
     * @return the lower case version of c
     */
    private static char toLowerCase(char c) {
        if (c >= 'A' && c <= 'Z') {
            // Upper and lower case letters are 32 apart in ASCII/Unicode
            return (char) (c + 32);
        }

        return c;
    }

    /**
     * Checks whether a character is a vowel (a, e, i, o, u in either case)
     * @param c the character to check
     * @return true if c is a vowel, false otherwise
     */
    private static boolean isVowel(char c) {
        char lower = toLowerCase(c);
        return lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u';
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
        if (text == null) {
            throw new IllegalArgumentException("Cannot check if null is a palindrome");
        }
        // Build the cleaned version - only letters/digits, all lower case
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

    //tow Pointer Palindrome
    /**
     * Two-pointer approach: compares characters from both ends, skipping
     * spaces, punctuation, and any other non-ASCII letter/digit characters.
     * Character case is ignored. Lowercasing is performed using Character.toLowerCase(),
     * which is permitted under the sheet rules.
     *
     * Contraindications: This method treats only ASCII letters and digits
     * as characters to compare. It does not handle all Unicode letters.
     *
     * @param text the string to check
     * @return true if the considered characters form a palindrome; false otherwise
     */
    public static boolean isPalindromeTwoPointer(String text) {
        if (text == null) {
            throw new IllegalArgumentException("Cannot check if null is a palindrome");
        }
        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            // Skip anything that should not be considered
            if (!isLetterOrDigit(text.charAt(left))) {
                left++;
            } else if (!isLetterOrDigit(text.charAt(right))) {
                right--;
            } else {
                // Both pointers are on a valid character - compare them (case-insensitive)
                if (toLowerCase(text.charAt(left)) != toLowerCase(text.charAt(right))) {
                    return false;
                }

                left++;
                right--;
            }
        }

        return true;
    }

    // PROBLEM 4: Reverse only the vowels in a String

    /**
     *
     */
    public static String reverseVowelsBruteForce(String text) {
        if (text == null) {
            throw new IllegalArgumentException("Cannot reverse the vowels of a null String");
        }

        char[] chars= text.toCharArray();

        char[] vowels = new char[chars.length];
        int vowelCount = 0;
        for (int i = 0; i< chars.length; i++){
            if (isVowel(chars[i])) {
                vowels[vowelCount] = chars[i];
                vowelCount++;
            }
        }

        left = 0;
        right = vowelCount -1;

        while (left < right){
            char temp = vowels[left];
            vowels[left] = vowels[right];
            vowels[right] = temp;

            left++;
            right--;
        }

        // putting reversed vowels back into chars
        int vowelIndex = 0;
        for (int i=0; i< chars.length; i++) {
            if (isVowel(chars[i])){
                chars[i] = vowels[vowelIndex];
                vowelIndex++;
            }
        }
        return new String(chars);
    }






}
