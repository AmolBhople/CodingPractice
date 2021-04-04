package ab.techstack.coding.datastructures.tree;

public class BinarySearchTree {

    public static BTNode<Integer> insert(BTNode<Integer> head, BTNode<Integer> node){                  //         50
        if(head ==null){                                                                        //          10          60
            return node;                                                                        //       5     13   55       78
        }
        if(node.getData() <= head.getData()){  // move node to left
            head.setLeftChild(insert(head.getLeftChild(), node));
        }else{
            head.setRightChild(insert(head.getRightChild(), node));
        }
        return head;
    }

    public static BTNode<Integer> lookup(BTNode<Integer> head, int data){
        if(head == null){
            return null;
        }
        if(head.getData() == data){
            return head;
        }
        if(data <= head.getData()){
            return lookup(head.getLeftChild(), data);
        }else{
            return lookup(head.getRightChild(), data);
        }
    }
}
