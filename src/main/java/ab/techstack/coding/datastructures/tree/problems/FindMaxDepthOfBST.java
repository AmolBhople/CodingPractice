package ab.techstack.coding.datastructures.tree.problems;

import ab.techstack.coding.datastructures.tree.BTNode;

public class FindMaxDepthOfBST {
    public static Integer maxDepthOfBT(BTNode<Integer> head){
        if(head == null){
            return 0;
        }
        if(head.getLeftChild() == null && head.getRightChild() == null){
            return 0;
        }
        int leftHeight =  1 + maxDepthOfBT(head.getLeftChild());
        int rightHeight = 1 + maxDepthOfBT(head.getRightChild());

        return Math.max(leftHeight, rightHeight);
    }
}
