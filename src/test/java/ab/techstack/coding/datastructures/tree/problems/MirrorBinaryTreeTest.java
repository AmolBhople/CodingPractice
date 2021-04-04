package ab.techstack.coding.datastructures.tree.problems;

import ab.techstack.coding.datastructures.tree.BSTUtil;
import ab.techstack.coding.datastructures.tree.BTNode;
import ab.techstack.coding.datastructures.tree.BreadthFirstTraversalOfBT;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MirrorBinaryTreeTest {

    @Test
    void mirrorBinaryTree() {
        BTNode<Integer> bst = BSTUtil.getBST();
        BreadthFirstTraversalOfBT bft = new BreadthFirstTraversalOfBT();
        bft.breadthFirstTraversalForInt(bst);

        BTNode<Integer> mirrorBST = MirrorBinaryTree.mirrorBinaryTree(bst);
        System.out.println("\nMirror\n");
        bft.breadthFirstTraversal(mirrorBST);
    }
}