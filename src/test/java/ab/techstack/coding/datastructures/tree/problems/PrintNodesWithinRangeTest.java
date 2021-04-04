package ab.techstack.coding.datastructures.tree.problems;

import ab.techstack.coding.datastructures.tree.BSTUtil;
import ab.techstack.coding.datastructures.tree.BTNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintNodesWithinRangeTest {

    @Test
    void printAllNodesWithinRange() {
        BTNode<Integer> bst = BSTUtil.getBST();
        PrintNodesWithinRange.printAllNodesWithinRange(bst, 6, 75);
    }
}