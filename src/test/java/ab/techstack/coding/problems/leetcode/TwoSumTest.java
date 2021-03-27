package ab.techstack.coding.problems.leetcode;

import ab.techstack.coding.problems.leetcode.TwoSum;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void twoSum() {
        TwoSum twoSum = new TwoSum();

        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        int[] expectedOut = new int[]{0,1};
        int[] output = twoSum.twoSum(nums, target);
        assertArrayEquals(expectedOut, output);

        nums = new int[]{3,2,4};
        target = 6;
        expectedOut = new int[]{1,2};
        output = twoSum.twoSum(nums, target);
        assertArrayEquals(expectedOut, output);

        nums = new int[]{3,3};
        target = 6;
        expectedOut = new int[]{0,1};
        output = twoSum.twoSum(nums, target);
        assertArrayEquals(expectedOut, output);

        nums = new int[]{30,1,2,4,4,5,6,7,8,9,99,98,97,96,65,54,43,56,67,78,89,3};
        target = 33;
        expectedOut = new int[]{0,21};
        output = twoSum.twoSum(nums, target);
        assertArrayEquals(expectedOut, output);
    }

    @ParameterizedTest(name = "#{index} - Test with int array : {0}")
    @MethodSource("intArrayProviderSuccess")
    void hasTwoSome(int[] nums) {
        TwoSum twoSum = new TwoSum();
        int target = 8;
        assertTrue(twoSum.hasTwoSome(nums, target), "Passed: Found element with sum 8");
    }

    @ParameterizedTest(name = "#{index} - Test with int array : {0}")
    @MethodSource("intArrayProviderFailure")
    void hasTwoSomeNegative(int[] nums) {
        TwoSum twoSum = new TwoSum();
        int target = 8;
        assertFalse(twoSum.hasTwoSome(nums, target), "Passed: not Found element with sum 8");
    }

    @Test
    void hasTwoSomeNegative1() {
        TwoSum twoSum = new TwoSum();
        int target = 1;
        assertTrue(twoSum.hasTwoSome( new int[]{1,0}, target), "Passed: not Found element with sum 8");
    }
    static Stream<int[]> intArrayProviderSuccess() {
        return Stream.of(
                new int[]{-1,2,3,9},
                new int[]{1,2,4,4},
                new int[]{9,2,7,1},
                new int[]{9,13,4,-5},
                new int[]{1,0}

                );
    }

    static Stream<int[]> intArrayProviderFailure() {
        return Stream.of(
                new int[]{1,2,3,9},
                new int[]{1,2,4,5},
                new int[]{9,2,7,8},
                new int[]{9,13,4,5}

        );
    }


}