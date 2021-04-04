package ab.techstack.coding.datastructures.tree.problems;

import ab.techstack.coding.datastructures.tree.BTNode;

public class MirrorBinaryTree {
    public static BTNode<Integer> mirrorBinaryTree(BTNode<Integer> head){
        if(head == null){
            return null;
        }
        if(head.getLeftChild() == null && head.getRightChild() == null){
            return head;
        }
        mirrorBinaryTree(head.getLeftChild());
        mirrorBinaryTree(head.getRightChild());

        BTNode<Integer> temp = head.getLeftChild();
        head.setLeftChild( head.getRightChild());
        head.setRightChild(temp);

        return head;
    }
}
