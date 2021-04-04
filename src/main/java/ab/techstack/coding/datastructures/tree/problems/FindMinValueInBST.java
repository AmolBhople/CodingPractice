package ab.techstack.coding.datastructures.tree.problems;

import ab.techstack.coding.datastructures.tree.BTNode;

public class FindMinValueInBST {

    public static Integer findMinValue(BTNode<Integer> head){
        if(head == null){
            return Integer.MIN_VALUE;
        }
        if(head.getLeftChild() == null){
            return head.getData();
        }
        return findMinValue(head.getLeftChild());
    }
}
