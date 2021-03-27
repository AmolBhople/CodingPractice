package ab.techstack.coding.problems.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntToRomanTest {
IntToRoman intToRoman =new IntToRoman();
    @Test
    void intToRoman() {
        String s = intToRoman.intToRoman(3);
        assertEquals("III",s);
    }
    @Test
    void intToRoman1() {
        String s = intToRoman.intToRoman(4);
        assertEquals("IV",s);
    }
    @Test
    void intToRoman2() {
        String s = intToRoman.intToRoman(9);
        assertEquals("IX",s);
    }
    @Test
    void intToRoman3() {
        String s = intToRoman.intToRoman(58);
        assertEquals("LVIII",s);
    }
    @Test
    void intToRoman4() {
        String s = intToRoman.intToRoman(1994);
        assertEquals("MCMXCIV",s);
    }

}