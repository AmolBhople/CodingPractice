package ab.techstack.coding.datastructures.tree;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BreadthFirstTraversalOfBTTest {

    BreadthFirstTraversalOfBT traversal = new BreadthFirstTraversalOfBT();

    @Test
    public void charBFSofBT(){
        BTNode<Character> charBT = BinaryTree.createCharBT();
        List<Character> returnList = traversal.breadthFirstTraversalForChar(charBT);
        List<Character> charList = new ArrayList<>();
        charList.add('A');
        charList.add('B');
        charList.add('C');
        charList.add('X');
        charList.add('D');
        charList.add('E');
        charList.add('F');
        charList.add('H');
        charList.add('G');
        assertEquals(charList,returnList);
        //expected sysout =  A  B  C  X  D   E   F  H  G
    }

    @Test
    public void charBFSofBTEmpty(){
        List<Character> returnList = traversal.breadthFirstTraversalForChar(null);
        List<Character> charList = new ArrayList<>();
        assertEquals(charList,returnList);
        //expected sysout =
    }


    @Test
    public void integerBFSofBT(){
        BTNode<Integer> integerBT = BinaryTree.createIntegerBT();
        List<Integer> returnList = traversal.breadthFirstTraversalForInt(integerBT);
        List<Integer> integerBTList = new ArrayList<>();
        integerBTList.add(52);
        integerBTList.add(23);
        integerBTList.add(45);
        integerBTList.add(2);
        integerBTList.add(65);
        integerBTList.add(5);
        integerBTList.add(89);
        integerBTList.add(78);
        integerBTList.add(12);
        assertEquals(integerBTList,returnList);
        //expected sysout =  52 23 45 2 65 5 89 78 12
    }

}