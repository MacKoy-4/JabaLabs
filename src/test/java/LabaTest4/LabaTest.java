package LabaTest4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import org.program.Laba4.*;

public class LabaTest {
    @Test // 4.1
     void IsPalindrome() {
        assertFalse(StringUtil.IsPalindrome(null)); // assertTrue -> assertFalse
        assertTrue(StringUtil.IsPalindrome("radar"));
        assertFalse(StringUtil.IsPalindrome("banana"));
        assertTrue(StringUtil.IsPalindrome("hannah"));
        assertTrue(StringUtil.IsPalindrome("pup"));
        assertTrue(StringUtil.IsPalindrome("nan"));
        assertFalse(StringUtil.IsPalindrome("lollipop"));
        assertTrue(StringUtil.IsPalindrome("eye"));
        assertTrue(StringUtil.IsPalindrome("6543456"));
        assertTrue(StringUtil.IsPalindrome("step on no pets"));
        assertFalse(StringUtil.IsPalindrome("A man a plan a canal Panama"));
    }
    @Test // 4.2
    void Decoder() {
        String message = "testing";
        String vowelEncoded = Decoder.EncodeVowels(message);
        String consonantEncoded = Decoder.EncodeConsonants(message);

        assertEquals(Decoder.EncodeVowels(message), "t2st3ng");
        System.out.println("Original: " + message);
        System.out.println("Vowel Encoded: " + vowelEncoded + ", Decoded: " + Decoder.DecodeConsonants(vowelEncoded));
        System.out.println("Consonant Encoded: " + consonantEncoded + ", Decoded: " + Decoder.DecodeConsonants(consonantEncoded));
    }
}
