package ab.techstack.coding.datastructures.tree;

public class BinaryTree {

    public static BTNode<Character> createCharBT(){
        BTNode<Character> a = new BTNode<>('A');
        BTNode<Character> b = new BTNode<>('B');
        BTNode<Character> c = new BTNode<>('C');
        BTNode<Character> d = new BTNode<>('D');
        BTNode<Character> e = new BTNode<>('E');
        BTNode<Character> f = new BTNode<>('F');
        BTNode<Character> g = new BTNode<>('G');
        BTNode<Character> h = new BTNode<>('H');
        BTNode<Character> x = new BTNode<>('X');

        //A's children
        a.setLeftChild(b);
        a.setRightChild(c);
        //C's children
        c.setLeftChild(d);
        c.setRightChild(e);
        //D's children
        d.setLeftChild(f);
        d.setRightChild(h);
        //E's children
        e.setRightChild(g);
        //B's children
        b.setLeftChild(x);

        return a;
    }

    public static BTNode<Integer> createIntegerBT(){
        BTNode<Integer> a = new BTNode<>(52);
        BTNode<Integer> b = new BTNode<>(23);
        BTNode<Integer> c = new BTNode<>(45);
        BTNode<Integer> d = new BTNode<>(65);
        BTNode<Integer> e = new BTNode<>(5);
        BTNode<Integer> f = new BTNode<>(89);
        BTNode<Integer> g = new BTNode<>(12);
        BTNode<Integer> h = new BTNode<>(78);
        BTNode<Integer> x = new BTNode<>(2);

        //A's children
        a.setLeftChild(b);                      //   52
        a.setRightChild(c);               //      /      \
        //C's children                     //   23       45
        c.setLeftChild(d);          //          /       /    \
        c.setRightChild(e); //                 2       65     5
        //D's children//                //           /    \    \
        d.setLeftChild(f);     //                   89    78    12
        d.setRightChild(h);
        //E's children
        e.setRightChild(g);
        //B's children
        b.setLeftChild(x);
        return a;
    }

    public static BTNode<Integer> createIntegerBT2(){
        BTNode<Integer> a = new BTNode<>(5);
        BTNode<Integer> b = new BTNode<>(65);
        BTNode<Integer> c = new BTNode<>(45);
        BTNode<Integer> d = new BTNode<>(89);
        BTNode<Integer> e = new BTNode<>(52);
        BTNode<Integer> f = new BTNode<>(89);
        BTNode<Integer> g = new BTNode<>(12);
        BTNode<Integer> h = new BTNode<>(78);
        BTNode<Integer> x = new BTNode<>(200);

        //A's children
        a.setLeftChild(b);                      //
        a.setRightChild(c);               //      4
        //C's children                     //
        c.setLeftChild(d);          //
        c.setRightChild(e); //
        //D's children//                //           /    \    \
        d.setLeftChild(f);     //
        d.setRightChild(h);
        //E's children
        e.setRightChild(g);
        //B's children
        b.setLeftChild(x);
        return a;
    }



    public static BTNode<Integer> createIntegerBTSubTree(){
        BTNode<Integer> c = new BTNode<>(45);
        BTNode<Integer> d = new BTNode<>(65);
        BTNode<Integer> e = new BTNode<>(5);
        BTNode<Integer> f = new BTNode<>(89);
        BTNode<Integer> g = new BTNode<>(12);
        BTNode<Integer> h = new BTNode<>(78);

        //C's children                                    45
        c.setLeftChild(d);          //                  /    \
        c.setRightChild(e); //                         65     5
        //D's children//                //           /    \    \
        d.setLeftChild(f);     //                   89    78    12
        d.setRightChild(h);
        //E's children
        e.setRightChild(g);

        return c;
    }

    public static void printNodeData(BTNode btNode){
        System.out.print(" "+btNode.getData()+"->");
    }
}
