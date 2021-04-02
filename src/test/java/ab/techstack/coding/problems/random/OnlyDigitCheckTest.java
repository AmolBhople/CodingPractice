package ab.techstack.coding.problems.random;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class OnlyDigitCheckTest {
    OnlyDigitCheck onlyDigitCheck =new OnlyDigitCheck();

    @ParameterizedTest(name = "#{index} - Run test with args={0}")
    @ValueSource(strings = {"212164112", "255222345", "8979813223"})
    void containsOnlyDigits(String arg) {
        assertTrue(onlyDigitCheck.containsOnlyDigits(arg));
    }

    @ParameterizedTest(name = "#{index} - Run test with args={0}")
    @ValueSource(strings = {"897845656231", "987654123", "1335644897"})
    void containsOnlyDigitsUsingJ8(String arg) {
        assertTrue(onlyDigitCheck.containsOnlyDigitsUsingJ8(arg));
    }

    @ParameterizedTest(name = "#{index} - Run test with args={0}")
    @ValueSource(strings = {"34435565464apple", "435435435435banana", "orang67657657e"})
    void containsOnlyDigitsNegative(String arg) {
        assertFalse(onlyDigitCheck.containsOnlyDigits(arg));
    }

    @ParameterizedTest(name = "#{index} - Run test with args={0}")
    @ValueSource(strings = {"ap6764546ple", "ban6767333ana", "oran3456709876543ge"})
    void containsOnlyDigitsUsingJ8Negative(String arg) {
        assertFalse(onlyDigitCheck.containsOnlyDigitsUsingJ8(arg));
    }

    @ParameterizedTest(name = "#{index} - Run test with args={0}")
    @ValueSource(strings = {"897845656231", "987654123", "1335644897"})
    void containsOnlyDigitsUsingRegex(String arg) {
        assertTrue(onlyDigitCheck.containsOnlyDigitsUsingRegex(arg));
    }

    @ParameterizedTest(name = "#{index} - Run test with args={0}")
    @ValueSource(strings = {"34435565464apple", "435435435435banana", "orang67657657e"})
    void containsOnlyDigitsRegexNegative(String arg) {
        assertFalse(onlyDigitCheck.containsOnlyDigitsUsingRegex(arg));
    }


}