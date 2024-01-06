package org.program.Laba4;

public class Decoder {

    static char[] consonants = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};
    static char[] bigConsonants = {'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z'};

    // Кодування заміни голосних
    public static String EncodeVowels(String sString) {
        sString = sString.replaceAll("a", "1");
        sString = sString.replaceAll("e", "2");
        sString = sString.replaceAll("i", "3");
        sString = sString.replaceAll("o", "4");
        sString = sString.replaceAll("u", "5");

        return sString;
    }
    // Кодування заміни приголосних
    public static String EncodeConsonants(String sString) {
        if (sString == null) {
            return "";
        }
        String ResultString = "";
        for (int i = 0; i < sString.length(); i++) {

            char Symbol = sString.charAt(i);
            if (isVowel(Symbol)) {
                ResultString = ResultString + Symbol;
            } else {
                for (int j = 0; j < consonants.length; j++) {
                    if (Symbol == consonants[j]) {
                        ResultString = ResultString + consonants[j+1];
                    } else if (Symbol == bigConsonants[j]) {
                        ResultString = ResultString + bigConsonants[j+1];
                    }
                }
            }
        }
        return ResultString;
    }
    // Декодування заміни приголосних
    public static String DecodeConsonants(String sString) {
        if (sString == null) {
            return "";
        }
        String ResultString = "";
        for (int i = 0; i < sString.length(); i++) {

            char Symbol = sString.charAt(i);
            if (isVowel(Symbol)) {
                ResultString = ResultString + Symbol;
            } else {
                for (int j = 0; j < consonants.length; j++) {
                    if (Symbol == consonants[j]) {
                        ResultString = ResultString + consonants[j-1];
                    } else if (Symbol == bigConsonants[j]) {
                        ResultString = ResultString + bigConsonants[j-1];
                    }
                }
            }
        }
        return ResultString;
    }

    // Это гласная
    public static boolean isVowel(char ch) {
        char lowercaseCh = Character.toLowerCase(ch);
        return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o' || lowercaseCh == 'u';
    }
}
