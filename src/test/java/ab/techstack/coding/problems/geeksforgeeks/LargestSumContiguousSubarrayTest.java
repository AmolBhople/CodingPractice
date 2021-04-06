package ab.techstack.coding.problems.geeksforgeeks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestSumContiguousSubarrayTest {

    @Test
    void maxSubArraySum() {
        int maxSum = LargestSumContiguousSubarray.maxSubArraySum(new int[]{-2, -3, 4, -1, -2, 1, 5, -3});
        assertEquals(7, maxSum);
    }

    @Test
    void maxSubArraySumPrintIndex() {
        int maxSum = LargestSumContiguousSubarray.maxSubArraySumPrintIndex(new int[]{2, -8, 4, -1, -2, 1, 5, -3});
        assertEquals(7, maxSum);
    }

    @Test
    void maxSubArraySumPrintIndex2() {
        int maxSum = LargestSumContiguousSubarray.maxSubArraySumPrintIndex(new int[]{20, -18, 4, -1, -2, 1, 50, -3});
        assertEquals(54, maxSum);
    }
}