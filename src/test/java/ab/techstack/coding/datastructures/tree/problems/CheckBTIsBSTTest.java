package ab.techstack.coding.datastructures.tree.problems;

import ab.techstack.coding.datastructures.tree.BSTUtil;
import ab.techstack.coding.datastructures.tree.BTNode;
import ab.techstack.coding.datastructures.tree.BinaryTree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckBTIsBSTTest {

    @Test
    void isBST1() {
        BTNode<Integer> bst2 = BSTUtil.getBST2();
        BTNode<Integer> integerBT = BinaryTree.createIntegerBT();
        boolean isbst = CheckBTIsBST.isBST(integerBT, 0, 90);
        assertFalse(isbst);
    }


    @Test
    void isBST2() {
        BTNode<Integer> bst2 = BSTUtil.getBST2();
        boolean isbst = CheckBTIsBST.isBST(bst2, 0, 100);
        assertTrue(isbst);
    }
}