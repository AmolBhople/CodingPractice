package ab.techstack.coding.problems.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntTest {

    RomanToInt romanToInt = new RomanToInt();
    @Test
    void romanToInt() {
        int num = romanToInt.romanToInt("LVIII");
        assertEquals(58,num);
    }
    @Test
    void romanToInt1994() {
        int num = romanToInt.romanToInt("MCMXCIV");
        assertEquals(1994,num);
    }
    @Test
    void romanToInt3() {
        int num = romanToInt.romanToInt("III");
        assertEquals(3,num);
    }
    @Test
    void romanToInt1() {
        int num = romanToInt.romanToInt("I");
        assertEquals(1,num);
    }
    @Test
    void romanToInt9() {
        int num = romanToInt.romanToInt("IX");
        assertEquals(9,num);
    }
}