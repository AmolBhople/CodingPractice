package ab.techstack.coding.problems.leetcode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class LongestCommonPrefixTest {

LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

    @ParameterizedTest(name = "#{index} - Test with String : {0}")
    @MethodSource("test1")
    void longestCommonPrefixTest1(List<String> arg) {
        String[] strings = arg.toArray(new String[arg.size()]);
        assertEquals("", longestCommonPrefix.longestCommonPrefix(strings));
    }

    static Stream<Arguments> test1() {
        return Stream.of(
                arguments(Arrays.asList("a", "b", "c"))
        );
    }

        @ParameterizedTest(name = "#{index} - Test with String : {0}")
        @MethodSource("test2")
        void longestCommonPrefixTest2(List<String> arg) {
            String[] strings = arg.toArray(new String[arg.size()]);
            assertEquals("a", longestCommonPrefix.longestCommonPrefix(strings));
        }

        static Stream<Arguments> test2() {
            return Stream.of(
                    arguments(Arrays.asList("abc", "abbbc", "ac"))
            );
        }

    @ParameterizedTest(name = "#{index} - Test with String : {0}")
    @MethodSource("test3")
    void longestCommonPrefixTest3(List<String> arg) {
        String[] strings = arg.toArray(new String[arg.size()]);
        assertEquals("fl", longestCommonPrefix.longestCommonPrefix(strings));
    }

    static Stream<Arguments> test3() {
        return Stream.of(
                arguments(Arrays.asList("flower","flow","flight"))
        );
    }

}