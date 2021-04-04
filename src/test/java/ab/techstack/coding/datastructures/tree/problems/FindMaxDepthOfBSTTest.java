package ab.techstack.coding.datastructures.tree.problems;

import ab.techstack.coding.datastructures.tree.BSTUtil;
import ab.techstack.coding.datastructures.tree.BTNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMaxDepthOfBSTTest {

    @Test
    void maxDepth1() {
        BTNode<Integer> bst = BSTUtil.getBST();
        Integer maxDepthActual = FindMaxDepthOfBST.maxDepthOfBT(bst);
        assertEquals(2, maxDepthActual);
    }
    @Test
    void maxDepth2() {
        BTNode<Integer> bst = BSTUtil.getBST2();
        Integer maxDepthActual = FindMaxDepthOfBST.maxDepthOfBT(bst);
        assertEquals(3, maxDepthActual);
    }
    @Test
    void maxDepthNull() {
        Integer maxDepthActual = FindMaxDepthOfBST.maxDepthOfBT(null);
        assertEquals(0, maxDepthActual);
    }
    @Test
    void maxDepth1Node() {
        BTNode<Integer> head = new BTNode<>(12);
        Integer maxDepthActual = FindMaxDepthOfBST.maxDepthOfBT(head);
        assertEquals(0, maxDepthActual);
    }

}