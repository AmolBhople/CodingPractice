package ab.techstack.coding.datastructures.tree.problems;

public class StructUniqueBTCount {
    public static int countTrees(int noOfNodes){
        if(noOfNodes <= 1){
            return 1;
        }
        int sum = 0;
        for (int i = 1; i <= noOfNodes ; i++) {
            int leftSubTreeCount = countTrees(i-1);
            int rightSubTreeCount = countTrees(noOfNodes-i);
            sum = sum+ (leftSubTreeCount * rightSubTreeCount);
        }
        return sum;
    }
}
