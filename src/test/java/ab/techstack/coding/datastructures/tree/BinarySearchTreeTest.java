package ab.techstack.coding.datastructures.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeTest {

    @Test
    void insertInBSTTest() {
        BTNode<Integer> head = getBST();
        BreadthFirstTraversalOfBT traversal = new BreadthFirstTraversalOfBT();
        traversal.breadthFirstTraversal(head);
        //expected BFT of BST   50-> 10-> 60-> 5-> 13-> 55-> 78->
    }

    @Test
    void lookupInBSTTrue() {
        BTNode<Integer> head = getBST();
        Integer data = 5;
        BTNode<Integer> lookupFound = BinarySearchTree.lookup(head, data);
        assertEquals(data, lookupFound.getData());

    }
    @Test
    void lookupInBSTFalse() {
        BTNode<Integer> head = getBST();
        Integer data = 51;
        BTNode<Integer> lookupFound = BinarySearchTree.lookup(head, data);
        assertNull(lookupFound);
    }

    private BTNode<Integer> getBST() {
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
}