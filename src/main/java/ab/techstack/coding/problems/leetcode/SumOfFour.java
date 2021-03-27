package ab.techstack.coding.problems.leetcode;

import java.util.*;

public class SumOfFour {

    public  List<List<Integer>> sumOfFour(int[] nums, int target) {
        List<List<Integer>> outList = new ArrayList<>();
        Set<List<Integer>> outset = new HashSet<>();
        Map<Integer, List<Pair>> pairMap = new HashMap<>();

//        Arrays.stream(nums).forEach(n-> System.out.println(n));

        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                int sumOf2 = target - (nums[i]+nums[j]);
                if(pairMap.containsKey(sumOf2)){
                    List<Pair> pairs = pairMap.get(sumOf2);
                    for(Pair pair: pairs){
                        int x= pair.x;
                        int y = pair.y;
                        if(i!=x && i!=y && j!=x && j!=y){
                            List<Integer> list = new ArrayList<>();
                            list.add(nums[i]);
                            list.add(nums[j]);
                            list.add(nums[x]);
                            list.add(nums[y]);
                            Collections.sort(list);
                            outset.add(list);
//                            System.out.println("  adding in list i="+i+" j="+j+"  x="+x+"   y="+y+"    sumOf2="+sumOf2+"");

                        }
                    }
                }
                pairMap.putIfAbsent(nums[i]+nums[j], new ArrayList<Pair>());
                pairMap.get(nums[i]+nums[j]).add(new Pair(i,j));
//                System.out.println("===adding in map     sum = "+(nums[i]+nums[j]));
//                pairMap.get(nums[i]+nums[j]).stream().forEach(pair -> System.out.println("at i="+ pair.x+"  and j="+pair.y));
            }
        }
        outList.addAll(0, outset);
        return outList;
    }
}

class Pair{
    int x;
    int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
