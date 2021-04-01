package ab.techstack.coding.problems.hackerrank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppleAndOrangeTest {

    @Test
    void countApplesAndOranges() {
        AppleAndOrange.countApplesAndOranges(7,11,5,15, new int[]{-2,2, 1}, new int[]{5, -6});

    }

    @Test
    void countApplesAndOranges2() {
        AppleAndOrange.countApplesAndOranges(7,10,4,12, new int[]{2,3,-4}, new int[]{3,-2,-4});

    }
    @Test
    void countApplesAndOranges3() {
        AppleAndOrange.countApplesAndOranges(2,3,1,5, new int[]{2}, new int[]{-2});

    }
}