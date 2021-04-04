package ab.techstack.coding.datastructures.tree.problems;

import ab.techstack.coding.datastructures.tree.BSTUtil;
import ab.techstack.coding.datastructures.tree.BTNode;
import ab.techstack.coding.datastructures.tree.BinarySearchTree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMinValueInBSTTest {

    @Test
    void findMinValue1() {
        BTNode<Integer> bst = BSTUtil.getBST();
        Integer minValue = FindMinValueInBST.findMinValue(bst);
        assertEquals(5, minValue);
    }
    @Test
    void findMinValue2() {
        BTNode<Integer> bst = BSTUtil.getBST2();
        Integer minValue = FindMinValueInBST.findMinValue(bst);
        assertEquals(2, minValue);
    }

    @Test
    void findMinValueNullTest() {
        Integer minValue = FindMinValueInBST.findMinValue( null);
        assertEquals(Integer.MIN_VALUE, minValue);
    }

}