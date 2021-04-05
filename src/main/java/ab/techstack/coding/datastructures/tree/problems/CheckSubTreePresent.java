package ab.techstack.coding.datastructures.tree.problems;

import ab.techstack.coding.datastructures.tree.BTNode;

public class CheckSubTreePresent {

    public static boolean isSubTreePresent(BTNode<Integer> tree1, BTNode<Integer> tree2){
        if(tree1 == null){
            return false;
        }
        //if Heads are not equal then do call same check with tree1 node moved to left or right
        if( ! nodeEqualityCheck(tree1, tree2) ){
            return isSubTreePresent(tree1.getLeftChild(), tree2) || isSubTreePresent(tree1.getRightChild(), tree2);
        }
        return true;
    }

    private static boolean nodeEqualityCheck(BTNode<Integer> nodeInTree1, BTNode<Integer> nodeInTree2){
        if(nodeInTree1 ==null && nodeInTree2 ==null){
            return true;
        }
        if(nodeInTree1 == null || nodeInTree2 == null){
            return false;
        }
        return nodeInTree1.getData() == nodeInTree2.getData() &&
                CheckSubTreePresent.nodeEqualityCheck(nodeInTree1.getLeftChild(), nodeInTree2.getLeftChild()) &&
                CheckSubTreePresent.nodeEqualityCheck(nodeInTree1.getRightChild(), nodeInTree2.getRightChild());
    }
}
