package ab.techstack.coding.problems.leetcode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {

    PalindromeNumber palindromeNumber = new PalindromeNumber();
    @ParameterizedTest(name = "#{index} - Test with int : {0}")
    @MethodSource("intProvider")
    void isPalindrome(int x) {
        assertFalse(palindromeNumber.isPalindrome(x));
    }

    static Stream<Integer> intProvider() {
        return Stream.of(13,223,453, Integer.MAX_VALUE, Integer.MIN_VALUE, -121, -1356897);
    }


    @ParameterizedTest(name = "#{index} - Test with int : {0}")
    @MethodSource("intProviderPalin")
    void isPalindromeSuccess(int x) {
        assertTrue(palindromeNumber.isPalindrome(x));
    }

    static Stream<Integer> intProviderPalin() {
        return Stream.of(11,212,33344333,1,2,101);
    }
}