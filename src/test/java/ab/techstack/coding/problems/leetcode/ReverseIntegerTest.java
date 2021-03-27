package ab.techstack.coding.problems.leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseIntegerTest {
    ReverseInteger reverseInteger = new ReverseInteger();

    @Test
    @DisplayName("Test with return value 321")
    void reverse() {
        int reverse = reverseInteger.reverse(123);
        assertEquals(321,reverse);
    }

    @Test
    @DisplayName("Test with min input")
    void reverseMinInput() {
//        System.out.println(Integer.MIN_VALUE);//-2147483648    8463847421
        int reverse = reverseInteger.reverse(Integer.MIN_VALUE);
        assertEquals(0,reverse);
    }

    @Test
    @DisplayName("Test with Max input")
    void reverseMaxInput() {
//        System.out.println(Integer.MAX_VALUE);//2147483647   =>7463847412
        int reverse = reverseInteger.reverse(Integer.MAX_VALUE);
        assertEquals(0,reverse);
    }


    @Test
    @DisplayName("Test with  value 1534236469")
    void reverse9() {
        int reverse = reverseInteger.reverse(1534236469);
        assertEquals(0,reverse);
    }

    @Test
    @DisplayName("Test with 0 input")
    void reverseZeroInput() {
        int reverse = reverseInteger.reverse(0);
        assertEquals(0,reverse);
    }


    @Test
    @DisplayName("Test with return value -123")
    void reverse2() {
        int reverse = reverseInteger.reverse(-123);
        assertEquals(-321,reverse);
    }

    @Test
    @DisplayName("Test with return value 120")
    void reverse3() {
        int reverse = reverseInteger.reverse(120);
        assertEquals(21,reverse);
    }


    @Test
    @DisplayName("Test with return value 120")
    void reverse4() {
        int reverse = reverseInteger.reverse(100);
        assertEquals(1,reverse);
    }


    @Test
    @DisplayName("Test with return value 000012")
    void reverse5() {
        int reverse = reverseInteger.reverse(12);
        assertEquals(21,reverse);
    }

    @Test
    @DisplayName("Test with return value 32")
    void reverse6() {
        int reverse = reverseInteger.reverse(32);
        assertEquals(23,reverse);
    }

    @Test
    @DisplayName("Test with return value 9")
    void reverse7() {
        int reverse = reverseInteger.reverse(9);
        assertEquals(9,reverse);
    }

    @Test
    @DisplayName("Test with  value -2147483412 ")
    void reverse8() {
        int reverse = reverseInteger.reverse(-2147483412);
        assertEquals(
                -2143847412,reverse);
    }

}