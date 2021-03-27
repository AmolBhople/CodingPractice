package ab.techstack.coding.problems.leetcode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;



class ValidParenthesesTest {

    ValidParentheses validParentheses = new ValidParentheses();
    @ParameterizedTest(name = "#{index} - Test with String : {0}")
    @MethodSource("validParenthesesProvider")
    void isValidParenthesesTest(String arg) {
        assertTrue(validParentheses.isValid(arg));
    }

    // this need static
    static Stream<String> validParenthesesProvider() {
        return Stream.of("()", "{}[]", "{[]}", "((((({[()]()})))))","");
    }

    @ParameterizedTest(name = "#{index} - Test with String : {0}")
    @MethodSource("notValidParenthesesProvider")
    void isNotValidParenthesesTest(String arg) {
        assertFalse(validParentheses.isValid(arg));
    }

    // this need static
    static Stream<String> notValidParenthesesProvider() {
        return Stream.of("(()", ")(", "(]","([)]",")", "(");
    }

}