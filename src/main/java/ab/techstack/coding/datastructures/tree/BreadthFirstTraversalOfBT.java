package ab.techstack.coding.datastructures.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstTraversalOfBT {

    public List<Character> breadthFirstTraversalForChar(BTNode node){
        List<Character> returnList = new ArrayList<>();
        if(node == null){
            return returnList;
        }
        Queue<BTNode> queue = new ArrayDeque<>();
        queue.add(node);
        while(!queue.isEmpty()){
            BTNode currentNode = queue.poll();

            BinaryTree.printNodeData(currentNode);
            returnList.add((Character) currentNode.getData());

            if(currentNode.getLeftChild()!=null){
                queue.add(currentNode.getLeftChild());
            }
            if(currentNode.getRightChild()!=null){
                queue.add(currentNode.getRightChild());
            }
        }
        return returnList;
    }

    public List<Integer> breadthFirstTraversalForInt(BTNode node){
        List<Integer> returnList = new ArrayList<>();
        if(node == null){
            return returnList;
        }
        Queue<BTNode> queue = new ArrayDeque<>();
        queue.add(node);
        while(!queue.isEmpty()){
            BTNode currentNode = queue.poll();

            BinaryTree.printNodeData(currentNode);
            returnList.add((Integer) currentNode.getData());

            if(currentNode.getLeftChild()!=null){
                queue.add(currentNode.getLeftChild());
            }
            if(currentNode.getRightChild()!=null){
                queue.add(currentNode.getRightChild());
            }
        }
        return returnList;
    }

    public void breadthFirstTraversal(BTNode node){
        if(node == null){
            return;
        }
        Queue<BTNode> queue = new ArrayDeque<>();
        queue.add(node);
        while(!queue.isEmpty()){

            BTNode currentNode = queue.poll();
            BinaryTree.printNodeData(currentNode);

            if(currentNode.getLeftChild()!=null){
                queue.add(currentNode.getLeftChild());
            }
            if(currentNode.getRightChild()!=null){
                queue.add(currentNode.getRightChild());
            }
        }
    }
}
