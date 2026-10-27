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



}
