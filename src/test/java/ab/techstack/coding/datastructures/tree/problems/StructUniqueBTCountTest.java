package ab.techstack.coding.datastructures.tree.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StructUniqueBTCountTest {

    @Test
    void countTrees1() {
        assertEquals(1, StructUniqueBTCount.countTrees(0));
    }
    @Test
    void countTrees2() {
        assertEquals(2, StructUniqueBTCount.countTrees(2));
    }
    @Test
    void countTrees3() {
        assertEquals(5, StructUniqueBTCount.countTrees(3));
    }
    @Test
    void countTrees4() {
        assertEquals(14, StructUniqueBTCount.countTrees(4));
    }
    @Test
    void countTrees5() {
        assertEquals(42, StructUniqueBTCount.countTrees(5));
    }
}