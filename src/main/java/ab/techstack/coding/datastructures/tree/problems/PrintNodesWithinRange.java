package ab.techstack.coding.datastructures.tree.problems;

import ab.techstack.coding.datastructures.tree.BTNode;

public class PrintNodesWithinRange {
    public static void printAllNodesWithinRange(BTNode<Integer> head, int min, int max){
        if(head == null){
            return;
        }
        if(min <= head.getData())
        printAllNodesWithinRange(head.getLeftChild(), min, max);

        if(min <= head.getData() && head.getData() < max){
            System.out.print(head.getData()+" ");
        }
        if(max > head.getData())
        printAllNodesWithinRange(head.getRightChild(), min, max);
    }
}
