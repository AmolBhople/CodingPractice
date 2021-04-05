package ab.techstack.coding.datastructures.tree.problems;

import ab.techstack.coding.datastructures.tree.BSTUtil;
import ab.techstack.coding.datastructures.tree.BTNode;
import ab.techstack.coding.datastructures.tree.BinaryTree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckSubTreePresentTest {

    @Test
    void isSubTreePresent() {
        BTNode<Integer> integerBT = BinaryTree.createIntegerBT();
        BTNode<Integer> subTree = BinaryTree.createIntegerBTSubTree();
        boolean subTreePresent = CheckSubTreePresent.isSubTreePresent(integerBT, subTree);
        assertTrue(subTreePresent);
    }


    @Test
    void isSubTreePresent2() {
        BTNode<Integer> integerBT = BinaryTree.createIntegerBT();
        BTNode<Integer> subTree = BinaryTree.createIntegerBT2();
        boolean subTreePresent = CheckSubTreePresent.isSubTreePresent(integerBT, subTree);
        assertFalse(subTreePresent);
    }
}