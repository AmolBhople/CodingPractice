package ab.techstack.coding.problems.random;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntToBinaryTest {

    IntToBinary intToBinary = new IntToBinary();
    @Test
    void intToBinary2() {
        String s = intToBinary.intToBinary(2);
        assertEquals("10",s);
    }
    @Test
    void intToBinary4() {
        String s = intToBinary.intToBinary(4);
        assertEquals("100",s);
    }
    @Test
    void intToBinary8() {
        String s = intToBinary.intToBinary(8);
        assertEquals("1000",s);
    }
    @Test
    void intToBinary7() {
        String s = intToBinary.intToBinary(7);
        assertEquals("111",s);
    }

}