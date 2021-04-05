package ab.techstack.coding.datastructures.tree.problems;

import ab.techstack.coding.datastructures.tree.BTNode;

public class CheckBTIsBST {
    //Check if a binary tree is a binary *search* tree
    public static boolean isBST(BTNode<Integer> head, int min, int max){
        if(head==null){
            return true;
        }
        if(head.getData() <= min || head.getData() > max){
            return false;
        }
        return isBST(head.getLeftChild(), min, head.getData()) && isBST(head.getRightChild(), head.getData(), max);
    }
}
