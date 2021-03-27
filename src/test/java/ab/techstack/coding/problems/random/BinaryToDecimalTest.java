package ab.techstack.coding.problems.random;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryToDecimalTest {


    BinaryToDecimal binaryToDecimal = new BinaryToDecimal();
    @Test
    void convertBinaryToDecimal() {
        int i = binaryToDecimal.convertBinaryToDecimal(101);
        assertEquals(  5, i);
    }


    @Test
    void convertBinaryToDecimal15() {
        int i = binaryToDecimal.convertBinaryToDecimal(1111);
        assertEquals(  15, i);
    }

    @Test
    void convertBinaryToDecimal17() {
        int i = binaryToDecimal.convertBinaryToDecimal(10001);
        assertEquals(  17, i);
    }
}