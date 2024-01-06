package org.program.Laba4;

public class StringUtil {
    public static boolean IsPalindrome(String asString) {
        if (asString == null) {
            return false;
        }
        asString = asString.toLowerCase();
        return asString.equals(new StringBuilder(asString).reverse().toString());
    }
}
