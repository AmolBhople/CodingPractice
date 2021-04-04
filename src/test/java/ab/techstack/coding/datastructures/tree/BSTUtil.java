package ab.techstack.coding.datastructures.tree;

public class BSTUtil {


    public static BTNode<Integer> getBST() {

        //               50
        //        10           60
        //     5     13     55     78

        BTNode<Integer> a = new BTNode<>(50);
        BTNode<Integer> b = new BTNode<>(10);
        BTNode<Integer> c = new BTNode<>(60);
        BTNode<Integer> d = new BTNode<>(5);
        BTNode<Integer> e = new BTNode<>(13);
        BTNode<Integer> f = new BTNode<>(55);
        BTNode<Integer> g = new BTNode<>(78);


        BTNode<Integer> head = BinarySearchTree.insert(null, a);
        BinarySearchTree.insert(head,b);
        BinarySearchTree.insert(head,c);
        BinarySearchTree.insert(head,e);
        BinarySearchTree.insert(head,g);
        BinarySearchTree.insert(head,d);
        BinarySearchTree.insert(head,f);

        return head;
    }

    public static BTNode<Integer> getBST2() {


        //               50
        //        10           60
        //     5     13     55     78
        //   2

        BTNode<Integer> head = getBST();
        BTNode<Integer> h = new BTNode<>(2);
        BinarySearchTree.insert(head,h);
        return head;
    }
}
